package com.bjike.goddess.moneyside.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.moneyside.bo.IncomeQuotaBO;
import com.bjike.goddess.moneyside.dto.ApplyInvestDTO;
import com.bjike.goddess.moneyside.dto.IncomeDistributionDTO;
import com.bjike.goddess.moneyside.dto.IncomeQuotaDTO;
import com.bjike.goddess.moneyside.entity.ApplyInvest;
import com.bjike.goddess.moneyside.entity.IncomeDistribution;
import com.bjike.goddess.moneyside.entity.IncomeQuota;
import com.bjike.goddess.moneyside.to.IncomeQuotaTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 收益分配额业务实现
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-06-07 09:28 ]
 * @Description: [ 收益分配额业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "moneysideSerCache")
@Service
public class IncomeQuotaSerImpl extends ServiceImpl<IncomeQuota, IncomeQuotaDTO> implements IncomeQuotaSer {
    @Autowired
    private ApplyInvestSer applyInvestSer;
    @Autowired
    private IncomeDistributionSer incomeDistributionSer;
    @Override
    public Long countIncomeQuota(IncomeQuotaDTO incomeQuotaDTO) throws SerException {
        Long count = super.count(incomeQuotaDTO);
        return count;
    }

    @Override
    public IncomeQuotaBO getOne(String id) throws SerException {
        if(StringUtils.isBlank(id)){
            throw new SerException("id不能为空");
        }
        IncomeQuota incomeQuota = super.findById(id);
        return BeanTransform.copyProperties(incomeQuota,IncomeQuotaBO.class);
    }

    @Override
    public List<IncomeQuotaBO> findListIncomeQuota(IncomeQuotaDTO incomeQuotaDTO) throws SerException {
        List<IncomeQuota> incomeQuotas = super.findByPage(incomeQuotaDTO);
        List<IncomeQuotaBO> incomeQuotaBOS = BeanTransform.copyProperties(incomeQuotas,IncomeQuotaBO.class);
        return incomeQuotaBOS;
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public IncomeQuotaBO insertIncomeQuota(IncomeQuotaTO incomeQuotaTO) throws SerException {
        IncomeQuota incomeQuota = BeanTransform.copyProperties(incomeQuotaTO,IncomeQuota.class,true);
        incomeQuota = count(incomeQuota);
        incomeQuota.setCreateTime(LocalDateTime.now());
        super.save(incomeQuota);
        return BeanTransform.copyProperties(incomeQuota,IncomeQuotaBO.class);
    }

    /**
     * 计算方法
     */
    public IncomeQuota count(IncomeQuota incomeQuota)throws SerException{
        ApplyInvestDTO applyInvestDTO = new ApplyInvestDTO();
        List<ApplyInvest> applyInvests = applyInvestSer.findByCis(applyInvestDTO);
        //该项目的累计投资金额(累计投资金额)
        Double accumulativeInvestMoney = 0.0;
        for(ApplyInvest applyInvest : applyInvests){
            accumulativeInvestMoney = applyInvest.getAccumulativeInvestMoney();
        }

        IncomeDistributionDTO incomeDistributionDTO = new IncomeDistributionDTO();
        List<IncomeDistribution> incomeDistributions = incomeDistributionSer.findByCis(incomeDistributionDTO);
        //投资分配比例
        Double proportionInvestment = 0.0;
        //风险控制保证金比例
        Double riskControlMarginRatio = 0.0;
        //总分配比例
        Double totalProportion = 0.0;
        for(IncomeDistribution incomeDistribution : incomeDistributions){
            proportionInvestment = incomeDistribution.getProportionInvestment();
            riskControlMarginRatio = incomeDistribution.getRiskControlMarginRatio();
            totalProportion = incomeDistribution.getTotalProportion();
        }
        //投资分配额(该项目的累计投资金额*投资分配比例)
        Double investmentAllocation = accumulativeInvestMoney*proportionInvestment;
        incomeQuota.setInvestmentAllocation(investmentAllocation);
        //风险控制保证金额（该项目的累计投资金额*风险控制保证金比例）
        Double riskControlGuaranteeAmount = accumulativeInvestMoney *riskControlMarginRatio;
        incomeQuota.setRiskControlGuaranteeAmount(riskControlGuaranteeAmount);
        //总分配额（该项目的累计投资金额*总分配比例）
        Double totalQuota = accumulativeInvestMoney * totalProportion;
        incomeQuota.setTotalQuota(totalQuota);
        return incomeQuota;
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public IncomeQuotaBO editIncomeQuota(IncomeQuotaTO incomeQuotaTO) throws SerException {
        IncomeQuota incomeQuota = super.findById(incomeQuotaTO.getId());
        if(StringUtils.isBlank(incomeQuotaTO.getId())){
            throw new SerException("id不能为空");
        }
        BeanTransform.copyProperties(incomeQuotaTO,incomeQuota,true);
        incomeQuota.setModifyTime(LocalDateTime.now());
        incomeQuota = count(incomeQuota);
        super.update(incomeQuota);
        return BeanTransform.copyProperties(incomeQuota,IncomeQuotaBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void removeIncomeQuota(String id) throws SerException {
        if(StringUtils.isBlank(id)){
            throw new SerException("id不能为空");
        }
        super.remove(id);
    }
}
package com.bjike.goddess.attainment.service;

import com.bjike.goddess.attainment.bo.AttainmentWayBO;
import com.bjike.goddess.attainment.dto.AttainmentWayDTO;
import com.bjike.goddess.attainment.entity.AttainmentWay;
import com.bjike.goddess.attainment.to.AttainmentWayTO;
import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 调研方式业务实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-06 09:51 ]
 * @Description: [ 调研方式业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "attainmentSerCache")
@Service
public class AttainmentWaySerImpl extends ServiceImpl<AttainmentWay, AttainmentWayDTO> implements AttainmentWaySer {

    @Override
    public AttainmentWayBO save(AttainmentWayTO to) throws SerException {
        AttainmentWay entity = BeanTransform.copyProperties(to, AttainmentWay.class);
        entity.setStatus(Status.THAW);
        super.save(entity);
        return BeanTransform.copyProperties(entity, AttainmentWayBO.class);
    }

    @Override
    public AttainmentWayBO update(AttainmentWayTO to) throws SerException {
        AttainmentWay entity = BeanTransform.copyProperties(to, AttainmentWay.class), way = super.findById(to.getId());
        if (null == way)
            throw new SerException("程序错误,请刷新重试");
        entity.setStatus(way.getStatus());
        entity.setCreateTime(way.getCreateTime());
        entity.setModifyTime(LocalDateTime.now());
        super.update(entity);
        return BeanTransform.copyProperties(entity, AttainmentWayBO.class);
    }

    @Override
    public AttainmentWayBO delete(String id) throws SerException {
        AttainmentWay entity = super.findById(id);
        super.remove(entity);
        return BeanTransform.copyProperties(entity, AttainmentWayBO.class);
    }

    @Override
    public AttainmentWayBO congeal(String id) throws SerException {
        AttainmentWay entity = super.findById(id);
        entity.setStatus(Status.CONGEAL);
        entity.setModifyTime(LocalDateTime.now());
        super.update(entity);
        return BeanTransform.copyProperties(entity, AttainmentWayBO.class);
    }

    @Override
    public AttainmentWayBO thaw(String id) throws SerException {
        AttainmentWay entity = super.findById(id);
        entity.setStatus(Status.THAW);
        entity.setModifyTime(LocalDateTime.now());
        super.update(entity);
        return BeanTransform.copyProperties(entity, AttainmentWayBO.class);
    }

    @Override
    public List<AttainmentWayBO> findThaw() throws SerException {
        AttainmentWayDTO dto = new AttainmentWayDTO();
        dto.getConditions().add(Restrict.eq(STATUS, Status.THAW));
        List<AttainmentWay> list = super.findByCis(dto);
        return BeanTransform.copyProperties(list, AttainmentWayBO.class);
    }
}
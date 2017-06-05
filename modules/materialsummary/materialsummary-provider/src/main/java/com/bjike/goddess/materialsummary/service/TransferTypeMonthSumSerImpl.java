package com.bjike.goddess.materialsummary.service;

import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.materialsummary.dto.TransferTypeMonthSumDTO;
import com.bjike.goddess.materialsummary.entity.TransferTypeMonthSum;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
* 调动类型月汇总业务实现
* @Author:			[ sunfengtao ]
* @Date:			[  2017-05-22 11:43 ]
* @Description:	[ 调动类型月汇总业务实现 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
@CacheConfig(cacheNames ="materialsummarySerCache")
@Service
public class TransferTypeMonthSumSerImpl extends ServiceImpl<TransferTypeMonthSum, TransferTypeMonthSumDTO> implements TransferTypeMonthSumSer { 

 }
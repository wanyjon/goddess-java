package com.bjike.goddess.customer.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.customer.dto.FirstFactorWeightDTO;
import com.bjike.goddess.customer.entity.FirstFactorWeight;

/**
* 一层因素层权重持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ lijuntao ]
* @Date:			[  2017-11-01 11:28 ]
* @Description:	[ 一层因素层权重持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface FirstFactorWeightRep extends JpaRep<FirstFactorWeight ,FirstFactorWeightDTO> { 

 }
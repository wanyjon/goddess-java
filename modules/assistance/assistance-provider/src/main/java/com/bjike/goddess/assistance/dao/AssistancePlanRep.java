package com.bjike.goddess.assistance.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.assistance.dto.AssistancePlanDTO;
import com.bjike.goddess.assistance.entity.AssistancePlan;

/**
* 补助方案持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ tanghaixiang ]
* @Date:			[  2017-04-13 09:27 ]
* @Description:	[ 补助方案持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface AssistancePlanRep extends JpaRep<AssistancePlan ,AssistancePlanDTO> { 

 }
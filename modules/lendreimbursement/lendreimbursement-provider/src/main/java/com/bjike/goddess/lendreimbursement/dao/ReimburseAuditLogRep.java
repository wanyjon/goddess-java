package com.bjike.goddess.lendreimbursement.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.lendreimbursement.dto.ReimburseAuditLogDTO;
import com.bjike.goddess.lendreimbursement.entity.ReimburseAuditLog;

/**
* 报销审核日志表持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ tanghaixiang ]
* @Date:			[  2017-04-11 05:48 ]
* @Description:	[ 报销审核日志表持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface ReimburseAuditLogRep extends JpaRep<ReimburseAuditLog ,ReimburseAuditLogDTO> { 

 }
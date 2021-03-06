package com.bjike.goddess.quartz.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.quartz.dto.ScheduleJobDTO;
import com.bjike.goddess.quartz.entity.ScheduleJob;

/**
 * 任务调度持久化接口, 继承基类可使用ｊｐａ命名查询
 *
 * @Author: [ liguiqin ]
 * @Date: [ 2017-04-06 02:24 ]
 * @Description: [ 任务调度持久化接口, 继承基类可使用ｊｐａ命名查询 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ScheduleJobRep extends JpaRep<ScheduleJob, ScheduleJobDTO> {

}
package com.bjike.goddess.dimission.action.dimission;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.interceptor.login.LoginAuth;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.dimission.api.WorkHandoverAPI;
import com.bjike.goddess.dimission.dto.WorkHandoverDTO;
import com.bjike.goddess.dimission.to.HandoverSuccessTO;
import com.bjike.goddess.dimission.to.WorkHandoverTO;
import com.bjike.goddess.dimission.vo.WorkHandoverVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 工作交接
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-17 02:24 ]
 * @Description: [ 工作交接 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("workhandover")
public class WorkHandoverAct {

    @Autowired
    private WorkHandoverAPI workHandoverAPI;

    /**
     * 保存
     *
     * @param to 工作交接传输对象
     * @return class WorkHandoverVO
     * @version v1
     */
    @PostMapping("v1/save")
    public Result save(@Validated(ADD.class) WorkHandoverTO to, BindingResult result) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(workHandoverAPI.save(to), WorkHandoverVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 修改
     *
     * @param to 工作交接传输对象
     * @return class WorkHandoverVO
     * @version v1
     */
    @PutMapping("v1/update/{id}")
    public Result update(@Validated(EDIT.class) WorkHandoverTO to, BindingResult result) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(workHandoverAPI.update(to), WorkHandoverVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除
     *
     * @param id 工作交接数据id
     * @return class WorkHandoverVO
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(workHandoverAPI.delete(id), WorkHandoverVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 交接人确认
     *
     * @param to 工作交接确认信息传输对象
     * @return class WorkHandoverVO
     * @version v1
     */
    @LoginAuth
    @PutMapping("v1/success/{id}")
    public Result success(@Validated(EDIT.class) HandoverSuccessTO to, BindingResult result) throws ActException {
        try {
            to.setAuthority(Boolean.FALSE);
            return ActResult.initialize(BeanTransform.copyProperties(workHandoverAPI.success(to), WorkHandoverVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 福利模块负责人确认
     *
     * @param to 工作交接确认信息传输对象
     * @return class WorkHandoverVO
     * @version v1
     */
    @PutMapping("v1/authority/{id}")
    public Result authority(@Validated(EDIT.class) HandoverSuccessTO to, BindingResult result) throws ActException {
        try {
            to.setAuthority(Boolean.TRUE);
            return ActResult.initialize(BeanTransform.copyProperties(workHandoverAPI.success(to), WorkHandoverVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 列表
     *
     * @param dto 工作交接数据传输对象
     * @return class WorkHandoverVO
     * @version v1
     */
    @GetMapping("v1/maps")
    public Result maps(WorkHandoverDTO dto) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(workHandoverAPI.maps(dto), WorkHandoverVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }


    /**
     * 根据id获取工作交接数据
     *
     * @param id 工作交接数据id
     * @return class WorkHandoverVO
     * @version v1
     */
    @GetMapping("v1/findById/{id}")
    public Result getById(@PathVariable String id, HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(workHandoverAPI.getById(id), WorkHandoverVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取总条数
     *
     * @version v1
     */
    @GetMapping("v1/getTotal")
    public Result getTotal() throws ActException {
        try {
            return ActResult.initialize(workHandoverAPI.getTotal());
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}
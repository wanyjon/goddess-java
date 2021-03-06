package com.bjike.goddess.materialtransfer.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.materialtransfer.dto.MaterialTransferDTO;
import com.bjike.goddess.materialtransfer.entity.MaterialTransfer;

/**
 * 物资调动持久化接口, 继承基类可使用ｊｐａ命名查询
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-28 10:47 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface MaterialTransferRep extends JpaRep<MaterialTransfer, MaterialTransferDTO> {

}
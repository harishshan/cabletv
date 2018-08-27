package com.blogspot.harishshan.cabletv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blogspot.harishshan.cabletv.constant.CommonConstant;
import com.blogspot.harishshan.cabletv.entity.ConnectionChargeTransaction;

@RepositoryRestResource(collectionResourceRel = CommonConstant.Table.CONNECTION_CHARGE_TRANSACTION , path = CommonConstant.Table.CONNECTION_CHARGE_TRANSACTION)
public interface ConnectionChargeTransactionRepository extends CrudRepository<ConnectionChargeTransaction, Integer>{

}
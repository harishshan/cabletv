package com.blogspot.harishshan.cabletv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blogspot.harishshan.cabletv.constant.CommonConstant;
import com.blogspot.harishshan.cabletv.entity.Transaction;

@RepositoryRestResource(collectionResourceRel = CommonConstant.Table.TRANSACTION , path = CommonConstant.Table.TRANSACTION)
public interface TransactionRepository extends CrudRepository<Transaction, Integer>{

}

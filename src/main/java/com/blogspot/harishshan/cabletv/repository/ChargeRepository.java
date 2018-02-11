package com.blogspot.harishshan.cabletv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blogspot.harishshan.cabletv.constant.CommonConstant;
import com.blogspot.harishshan.cabletv.entity.Charge;

@RepositoryRestResource(collectionResourceRel = CommonConstant.Table.CHARGE , path = CommonConstant.Table.CHARGE)
public interface ChargeRepository extends CrudRepository<Charge, Integer>{

}

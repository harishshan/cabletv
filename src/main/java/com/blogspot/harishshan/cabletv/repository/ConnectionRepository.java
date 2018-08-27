package com.blogspot.harishshan.cabletv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blogspot.harishshan.cabletv.constant.CommonConstant;
import com.blogspot.harishshan.cabletv.entity.Connection;

@RepositoryRestResource(collectionResourceRel = CommonConstant.Table.CONNECTION , path = CommonConstant.Table.CONNECTION)
public interface ConnectionRepository extends CrudRepository<Connection, Integer>{

}

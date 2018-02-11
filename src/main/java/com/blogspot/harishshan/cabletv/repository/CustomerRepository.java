package com.blogspot.harishshan.cabletv.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blogspot.harishshan.cabletv.constant.CommonConstant;
import com.blogspot.harishshan.cabletv.entity.Customer;

@RepositoryRestResource(collectionResourceRel = CommonConstant.Table.CUSTOMER , path = CommonConstant.Table.CUSTOMER)
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	List<Customer> findByName(@Param("name") String name);
}

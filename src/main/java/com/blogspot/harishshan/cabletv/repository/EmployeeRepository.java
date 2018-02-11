package com.blogspot.harishshan.cabletv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blogspot.harishshan.cabletv.constant.CommonConstant;
import com.blogspot.harishshan.cabletv.entity.Employee;

@RepositoryRestResource(collectionResourceRel = CommonConstant.Table.EMPLOYEE , path = CommonConstant.Table.EMPLOYEE)
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}

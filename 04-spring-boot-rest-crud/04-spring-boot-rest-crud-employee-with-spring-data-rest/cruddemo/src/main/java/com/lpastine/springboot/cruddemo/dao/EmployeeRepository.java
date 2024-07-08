package com.lpastine.springboot.cruddemo.dao;

import com.lpastine.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// In case we don't want to customize the automatically generated path
// based on the class's name, we can specify the path
// @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it... no need to write any code
}

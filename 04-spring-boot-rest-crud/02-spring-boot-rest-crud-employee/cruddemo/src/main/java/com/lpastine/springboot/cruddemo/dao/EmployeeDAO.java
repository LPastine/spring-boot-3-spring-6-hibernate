package com.lpastine.springboot.cruddemo.dao;

import com.lpastine.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}

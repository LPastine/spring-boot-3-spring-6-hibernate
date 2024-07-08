package com.lpastine.springboot.cruddemo.service;

import com.lpastine.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}

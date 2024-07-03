package com.lpastine.cruddemo.dao;

import com.lpastine.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    // 1) Add new method to DAO interface
    List<Student> findAll();
}

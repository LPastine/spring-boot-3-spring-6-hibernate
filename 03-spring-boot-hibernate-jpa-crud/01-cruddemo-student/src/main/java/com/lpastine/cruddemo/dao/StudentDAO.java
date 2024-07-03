package com.lpastine.cruddemo.dao;

import com.lpastine.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    // 1) Add new method to DAO interface
    Student findById(Integer id);
}

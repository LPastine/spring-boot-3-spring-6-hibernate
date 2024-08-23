package com.lpastine.cruddemo.dao;

import com.lpastine.cruddemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);
}

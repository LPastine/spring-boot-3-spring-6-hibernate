package com.lpastine.cruddemo.dao;

import com.lpastine.cruddemo.entity.Instructor;
import com.lpastine.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);
}

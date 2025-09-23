package com.nati.cruddemo.dao;

import com.nati.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}

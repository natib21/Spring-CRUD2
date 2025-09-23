package com.nati.cruddemo.dao;

import com.nati.cruddemo.entity.Student;
import java.util.List;
public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
    List<Student> findAll();
}

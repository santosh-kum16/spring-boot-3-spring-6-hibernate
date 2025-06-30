package com.santosh.cruddemo.dao;

import com.santosh.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);



}

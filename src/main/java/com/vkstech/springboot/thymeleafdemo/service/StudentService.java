package com.vkstech.springboot.thymeleafdemo.service;

import com.vkstech.springboot.thymeleafdemo.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(int theId);

    void save(Student student);

    void deleteById(int theId);

}

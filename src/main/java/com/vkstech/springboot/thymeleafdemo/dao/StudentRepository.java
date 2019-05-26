package com.vkstech.springboot.thymeleafdemo.dao;

import com.vkstech.springboot.thymeleafdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

package com.vkstech.springboot.thymeleafdemo.repository;

import com.vkstech.springboot.thymeleafdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

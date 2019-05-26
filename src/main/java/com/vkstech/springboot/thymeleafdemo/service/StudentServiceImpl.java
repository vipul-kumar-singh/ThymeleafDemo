package com.vkstech.springboot.thymeleafdemo.service;

import com.vkstech.springboot.thymeleafdemo.dao.StudentRepository;
import com.vkstech.springboot.thymeleafdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository theStudentRepository) {
        studentRepository = theStudentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int theId) {
        Optional<Student> result = studentRepository.findById(theId);

        Student theStudent = null;

        if (result.isPresent()) {
            theStudent = result.get();
        } else {
            // we didn't find the student
            throw new RuntimeException("Did not find student id - " + theId);
        }

        return theStudent;
    }

    @Override
    public void save(Student theStudent) {
        studentRepository.save(theStudent);
    }

    @Override
    public void deleteById(int theId) {
        studentRepository.deleteById(theId);
    }

}







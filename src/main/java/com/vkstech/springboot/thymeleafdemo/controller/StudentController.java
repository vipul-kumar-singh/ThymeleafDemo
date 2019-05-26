package com.vkstech.springboot.thymeleafdemo.controller;

import com.vkstech.springboot.thymeleafdemo.entity.Student;
import com.vkstech.springboot.thymeleafdemo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String listStudents(Model model){

        // get employees from db
        List<Student> studentList = studentService.findAll();

        // add to the spring model
        model.addAttribute("students", studentList);

        return "list-students";
    }

    @GetMapping("/list/bootstrap")
    public String listStudentsBootstrap(Model model){

        // get employees from db
        List<Student> studentList = studentService.findAll();

        // add to the spring model
        model.addAttribute("students", studentList);

        return "list-students-bootstrap";
    }
}

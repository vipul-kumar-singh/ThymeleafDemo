package com.vkstech.springboot.thymeleafdemo.controller;

import com.vkstech.springboot.thymeleafdemo.entity.Student;
import com.vkstech.springboot.thymeleafdemo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String listStudents(Model model) {

        // get employees from db
        List<Student> studentList = studentService.findAll();

        // add to the spring model
        model.addAttribute("students", studentList);

        return "students/list-students";
    }

    @GetMapping("/list/bootstrap")
    public String listStudentsBootstrap(Model model) {

        // get employees from db
        List<Student> studentList = studentService.findAll();

        // add to the spring model
        model.addAttribute("students", studentList);

        return "students/list-students-bootstrap";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        //create model attribute to bind form data
        Student student = new Student();

        model.addAttribute("student", student);
        return "students/student-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("student") Student student){

        //save the student
        studentService.save(student);

        // use a redirect to prevent duplicate submissions
        return "redirect:/students/list/bootstrap";
    }
}

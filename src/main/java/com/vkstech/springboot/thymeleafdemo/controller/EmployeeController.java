package com.vkstech.springboot.thymeleafdemo.controller;

import com.vkstech.springboot.thymeleafdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    // load employee data
    private List<Employee> employeeList;

    @PostConstruct
    private void loadData() {

        //create employees
        Employee employee1 = new Employee(1, "Tom", "Holland", "tom@yopmail.com");
        Employee employee2 = new Employee(2, "Andrew", "Garfield", "andrew@yopmail.com");
        Employee employee3 = new Employee(3, "Tobey", "Mcguire", "tobey@yopmail.com");

        //create the list
        employeeList = new ArrayList<>();

        //add to the list
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
    }

    // add mapping for "/list"
    @GetMapping("/list")
    public String listEmployees(Model model){

        // add to the spring model
        model.addAttribute("employees", employeeList);

        return "list-employees";
    }

    @GetMapping("/list/bootstrap")
    public String listEmployeesBootstrap(Model model){

        // add to the spring model
        model.addAttribute("employees", employeeList);

        return "list-employees-bootstrap";
    }
}

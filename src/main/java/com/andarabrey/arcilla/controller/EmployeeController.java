package com.andarabrey.arcilla.controller;

import com.andarabrey.arcilla.entity.Employee;
import com.andarabrey.arcilla.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> findAll(){




    }


}

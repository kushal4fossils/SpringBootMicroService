package com.idiot.springboot.controller;

import com.idiot.springboot.model.Employee;
import com.idiot.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    @Autowired
    @Qualifier("employeeServiceImpl")
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee){
    return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeByID(@PathVariable String id){
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable String id){
        return  employeeService.deleteEmployeeById(id);
    }
}

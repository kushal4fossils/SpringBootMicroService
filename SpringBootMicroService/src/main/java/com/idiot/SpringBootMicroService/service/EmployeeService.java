package com.idiot.SpringBootMicroService.service;

import com.idiot.SpringBootMicroService.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);
}

package com.idiot.springboot.service;

import com.idiot.springboot.Exception.EmployeeNotFoundException;
import com.idiot.springboot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employeeList=new ArrayList<>();

    @Override
    public Employee save(Employee employee) {
        if(employee.getEmplId()==null || employee.getEmplId().isEmpty()) {
            employee.setEmplId(UUID.randomUUID().toString());
        }
        employeeList.add(employee);

        return employee;

    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employeeList.stream().filter(employee -> employee.getEmplId().equals(id)).findFirst().
                orElseThrow(()->new EmployeeNotFoundException(""+"Employee not found with Id: "+id));

    }

    @Override
    public String deleteEmployeeById(String id) {
        Employee employee=employeeList.stream().filter(e->e.getEmplId().equalsIgnoreCase(id) ).findFirst().get();
        employeeList.remove(employee);
        return "Employee deleted with the id: "+id;
    }


}

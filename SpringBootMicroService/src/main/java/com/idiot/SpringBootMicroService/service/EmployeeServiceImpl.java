package com.idiot.SpringBootMicroService.service;

import com.idiot.SpringBootMicroService.model.Employee;
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
}

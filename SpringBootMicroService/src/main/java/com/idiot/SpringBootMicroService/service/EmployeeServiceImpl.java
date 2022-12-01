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

    @Override
    public List<Employee> showEmployee(String name) {
        List empList;
        if(name==null || name.isEmpty()){
            System.out.println("Please enter valid name");
        }
        else if(employeeList.get(0).equals(name))
            empList=employeeList;
        return employeeList;
    }
}

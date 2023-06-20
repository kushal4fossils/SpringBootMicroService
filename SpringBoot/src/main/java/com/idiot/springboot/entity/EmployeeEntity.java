package com.idiot.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="tbl_employee")
@Getter
@Setter
@ToString
public class EmployeeEntity {
    @Id
    private String emplId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String department;
}

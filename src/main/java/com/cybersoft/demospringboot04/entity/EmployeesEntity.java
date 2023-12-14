package com.cybersoft.demospringboot04.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "employees")
public class EmployeesEntity {
    //Nhớ tên cột trong database mà có gạch đích thì bỏ gạch đích viết hoa chữ cái đầu

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "salary")
    private double salary;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "department_id")
    private int departmentId;
}

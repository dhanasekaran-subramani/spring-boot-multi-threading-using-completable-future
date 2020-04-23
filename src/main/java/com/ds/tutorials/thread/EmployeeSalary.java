package com.ds.tutorials.thread;

import lombok.Data;

import java.io.Serializable;

@Data

public class EmployeeSalary implements Serializable {

    private String empId;
    private double salary;
    private double hra;
    private double da;
}

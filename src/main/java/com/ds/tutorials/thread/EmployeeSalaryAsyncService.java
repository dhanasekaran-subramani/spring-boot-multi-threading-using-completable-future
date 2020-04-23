package com.ds.tutorials.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;

@Service
public class EmployeeSalaryAsyncService {

    @Async
    public CompletableFuture<EmployeeSalary> fetchSalary(String empId ){
        EmployeeSalary employeeSalary = new EmployeeSalary();
        employeeSalary.setEmpId(empId);
        employeeSalary.setSalary(20000);
        employeeSalary.setDa(1000);
        employeeSalary.setHra(2000);
        return CompletableFuture.completedFuture(employeeSalary);
    }
}

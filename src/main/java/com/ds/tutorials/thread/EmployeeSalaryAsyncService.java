package com.ds.tutorials.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

//TODO - @Async has two limitations
//it must be applied to public methods only
//self-invocation – calling the async method from within the same class – won't work
//The reasons are simple – the method needs to be public so that it can be proxied. And self-invocation doesn't work because it bypasses the proxy and calls the underlying method directly.
@Service
public class EmployeeSalaryAsyncService {

    @Async
    public CompletableFuture<EmployeeSalary> fetchSalary(String empId) {
        EmployeeSalary employeeSalary = new EmployeeSalary();
        employeeSalary.setEmpId(empId);
        employeeSalary.setSalary(20000);
        employeeSalary.setDa(1000);
        employeeSalary.setHra(2000);
        return CompletableFuture.completedFuture(employeeSalary);
    }
}

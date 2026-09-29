package com.spingbootapidevelop.springbootdevapi.service;

import com.spingbootapidevelop.springbootdevapi.entity.EmployeeEntity;
import com.spingbootapidevelop.springbootdevapi.repository.EmployeeRepo2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmployeeService2 {

    private final EmployeeRepo2 employeeRepo2;

    public EmployeeService2(EmployeeRepo2 employeeRepo2) {
        this.employeeRepo2 = employeeRepo2;
    }

    public List<EmployeeEntity> getEmployeeleaveswithindays(int days) {
        LocalDate today = LocalDate.now();

        LocalDate endDate = today.plusDays(days);

        return employeeRepo2.findByNoticeEndDateBetween(today,endDate);

    }
}
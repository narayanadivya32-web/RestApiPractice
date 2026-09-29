package com.spingbootapidevelop.springbootdevapi.controller;

import com.spingbootapidevelop.springbootdevapi.entity.EmployeeEntity;
import com.spingbootapidevelop.springbootdevapi.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

private final EmployeeService employeeService;

public EmployeeController(EmployeeService employeeService){
    this.employeeService=employeeService;
}
    @GetMapping("/test")
    public String test() {
        return "Employee API is working";
    }

@GetMapping("/noticeperiod")
    public ResponseEntity<List<EmployeeEntity>> getEmployeeServingNotice(){
        return ResponseEntity.ok(employeeService.getEmployeesServingNotice());
    }
}

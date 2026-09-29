package com.spingbootapidevelop.springbootdevapi.controller;

import com.spingbootapidevelop.springbootdevapi.entity.EmployeeEntity;
import com.spingbootapidevelop.springbootdevapi.service.EmployeeService2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeewithinnoticeController {

    private final EmployeeService2 employeeService2;

    public EmployeewithinnoticeController(EmployeeService2 employeeService2){
        this.employeeService2=employeeService2;

    }

    @GetMapping("/leaving")
    public ResponseEntity<List<EmployeeEntity>> getEmployeeLeaving(@RequestParam(defaultValue = "30") int days){

        return ResponseEntity.ok(employeeService2.getEmployeeleaveswithindays(days));
    }

}

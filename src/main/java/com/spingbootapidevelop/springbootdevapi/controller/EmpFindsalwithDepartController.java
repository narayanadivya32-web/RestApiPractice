package com.spingbootapidevelop.springbootdevapi.controller;


import com.spingbootapidevelop.springbootdevapi.entity.EmployeeEntity;
import com.spingbootapidevelop.springbootdevapi.service.EmpFindsalwithDepartService;
import com.spingbootapidevelop.springbootdevapi.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmpFindsalwithDepartController {

    private final EmpFindsalwithDepartService empFindsalwithDepartService;



    public EmpFindsalwithDepartController(EmpFindsalwithDepartService empFindsalwithDepartService) {
        this.empFindsalwithDepartService = empFindsalwithDepartService;
    }

    @GetMapping("/filter")
    public ResponseEntity<List<EmployeeEntity>> searchEmployee(
            @RequestParam String department,
            @RequestParam BigDecimal salary
            ){
        return ResponseEntity.ok(empFindsalwithDepartService.getEmployeesDepartmentAndSalary(department,salary));
    }
}

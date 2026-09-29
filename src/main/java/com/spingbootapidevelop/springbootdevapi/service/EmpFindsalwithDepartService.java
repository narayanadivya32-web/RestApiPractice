package com.spingbootapidevelop.springbootdevapi.service;

import com.spingbootapidevelop.springbootdevapi.entity.EmployeeEntity;
import com.spingbootapidevelop.springbootdevapi.repository.EmpFindsalwithDepartRepo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class EmpFindsalwithDepartService {

    private final EmpFindsalwithDepartRepo empFindsalwithDepartRepo;

    public EmpFindsalwithDepartService(EmpFindsalwithDepartRepo empFindsalwithDepartRepo){

        this.empFindsalwithDepartRepo=empFindsalwithDepartRepo;
    }

    public List<EmployeeEntity> getEmployeesDepartmentAndSalary(String department, BigDecimal salary){

        return empFindsalwithDepartRepo.findByDepartmentAndSalaryGreaterThan(department,salary);

    }

}

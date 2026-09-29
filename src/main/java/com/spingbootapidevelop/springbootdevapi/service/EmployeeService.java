package com.spingbootapidevelop.springbootdevapi.service;

import com.spingbootapidevelop.springbootdevapi.entity.EmployeeEntity;
import com.spingbootapidevelop.springbootdevapi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public List<EmployeeEntity> getEmployeesServingNotice(){
        LocalDate today = LocalDate.now();

        return  employeeRepository.findByNoticeStartDateLessThanEqualAndNoticeEndDateGreaterThanEqual(today,today);
    }


}

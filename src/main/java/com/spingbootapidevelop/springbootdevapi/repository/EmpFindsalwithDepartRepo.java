package com.spingbootapidevelop.springbootdevapi.repository;

import com.spingbootapidevelop.springbootdevapi.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.BitSet;
import java.util.List;

@Repository
public interface EmpFindsalwithDepartRepo extends JpaRepository<EmployeeEntity,Long> {

    List<EmployeeEntity> findByNoticeStartDateLessThanEqualAndNoticeEndDateGreaterThanEqual(
            LocalDate startDate,
            LocalDate endDate
    );

    List<EmployeeEntity> findByDepartmentAndSalaryGreaterThan(String departent, BigDecimal salary);

}

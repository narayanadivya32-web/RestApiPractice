package com.spingbootapidevelop.springbootdevapi.repository;

import com.spingbootapidevelop.springbootdevapi.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

    List<EmployeeEntity> findByNoticeStartDateLessThanEqualAndNoticeEndDateGreaterThanEqual(LocalDate startDtae,
                                                                                            LocalDate endDate);
}

package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteByEmploymentBookNumber(String number);
}

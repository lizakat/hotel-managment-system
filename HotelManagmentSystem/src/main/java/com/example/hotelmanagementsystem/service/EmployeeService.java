package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.entity.Employee;
import com.example.hotelmanagementsystem.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> listEmployees() {
        return employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    public void deleteEmployee(String number) {
        employeeRepository.deleteByEmploymentBookNumber(number);
    }
}

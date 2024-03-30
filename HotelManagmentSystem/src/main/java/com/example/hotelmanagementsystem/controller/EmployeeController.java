package com.example.hotelmanagementsystem.controller;

import com.example.hotelmanagementsystem.entity.Employee;
import com.example.hotelmanagementsystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/employee")
    public String employees(Model model) {
        model.addAttribute("employees", employeeService.listEmployees());
        return "employee";
    }

    @PostMapping("/employee/add")
    public String createEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employee";
    }

    @PostMapping("/employee/delete")
    public String deleteEmployee(@RequestParam String number) {
        employeeService.deleteEmployee(number);
        return "redirect:/employee";
    }
}

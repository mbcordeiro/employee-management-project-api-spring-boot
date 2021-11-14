package com.matheuscordeiro.employeemanagementprojectapi.controller;

import com.matheuscordeiro.employeemanagementprojectapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{name}")
    public ResponseEntity getEmployee(@PathVariable  String name) {
        return ResponseEntity.ok(employeeService.getEmployeeByName(name));
    }
}

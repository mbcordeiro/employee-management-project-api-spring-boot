package com.matheuscordeiro.employeemanagementprojectapi.service;

import com.matheuscordeiro.employeemanagementprojectapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeByName(String name);
}

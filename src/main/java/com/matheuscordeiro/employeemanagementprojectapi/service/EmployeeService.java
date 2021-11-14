package com.matheuscordeiro.employeemanagementprojectapi.service;

import com.matheuscordeiro.employeemanagementprojectapi.model.Employee;

public interface EmployeeService {
    public Employee getEmployeeByName(String name);
}

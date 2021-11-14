package com.matheuscordeiro.employeemanagementprojectapi.service;

import com.matheuscordeiro.employeemanagementprojectapi.model.Employee;
import com.matheuscordeiro.employeemanagementprojectapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
}

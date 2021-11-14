package com.matheuscordeiro.employeemanagementprojectapi.config;

import com.matheuscordeiro.employeemanagementprojectapi.service.EmployeeService;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class EmployeeServiceImplTestContextConfiguration {

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService() {

        };
    }
}

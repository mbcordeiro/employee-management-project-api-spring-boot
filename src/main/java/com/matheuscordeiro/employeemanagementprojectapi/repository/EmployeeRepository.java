package com.matheuscordeiro.employeemanagementprojectapi.repository;

import com.matheuscordeiro.employeemanagementprojectapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}

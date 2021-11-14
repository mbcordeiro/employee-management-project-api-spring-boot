package com.matheuscordeiro.employeemanagementprojectapi.repository;

import com.matheuscordeiro.employeemanagementprojectapi.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryIntegrationTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        Employee employee = new Employee("alex");
        entityManager.persist(employee);
        entityManager.flush();

        // when
        Employee found = employeeRepository.findByName(employee.getName());

        // then
        assertThat(found.getName())
                .isEqualTo(employee.getName());
    }
}

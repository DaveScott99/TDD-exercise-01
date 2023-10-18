package com.astro.bds01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astro.bds01.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

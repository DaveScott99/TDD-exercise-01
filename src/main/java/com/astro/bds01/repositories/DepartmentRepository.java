package com.astro.bds01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astro.bds01.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}

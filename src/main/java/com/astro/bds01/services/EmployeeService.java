package com.astro.bds01.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.astro.bds01.dto.EmployeeDTO;
import com.astro.bds01.entities.Department;
import com.astro.bds01.entities.Employee;
import com.astro.bds01.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	public Page<EmployeeDTO> findAll(Pageable pageable) {
		return repository.findAll(pageable)
				.map(emp -> new EmployeeDTO(emp));
	}
	
	public EmployeeDTO insert(EmployeeDTO employeeDTO) {
		return new EmployeeDTO(repository.save(new Employee(null, employeeDTO.getName(), employeeDTO.getEmail(), new Department(employeeDTO.getDepartmentId(), null))));
	}
}

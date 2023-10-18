package com.astro.bds01.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.astro.bds01.dto.DepartmentDTO;
import com.astro.bds01.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	private final DepartmentRepository repository;

	public DepartmentService(DepartmentRepository repository) {
		this.repository = repository;
	}

	public List<DepartmentDTO> findAll() {
		return repository.findAll()
				.stream()
				.map(dep -> new DepartmentDTO(dep))
				.sorted((h1, h2) -> h1.getName().compareTo(h2.getName()))
				.collect(Collectors.toList());
	}
	
}

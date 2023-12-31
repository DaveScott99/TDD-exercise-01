package com.astro.bds01.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astro.bds01.dto.DepartmentDTO;
import com.astro.bds01.services.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	private final DepartmentService service;

	public DepartmentController(DepartmentService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<DepartmentDTO>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
}

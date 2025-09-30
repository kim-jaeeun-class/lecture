package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.EmpDAO;
import com.example.demo.dto.EmpDTO;

@Controller
public class EmpController {
	
	@Autowired
	EmpDAO empDAO;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/empList")
	public String empList() {
		List<EmpDTO> list = empDAO.empList();
		return "hello";
	}
	
}

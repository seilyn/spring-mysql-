package com.myapp;

import org.springframework.stereotype.Controller; // REST API x -> 단순 Controller
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Controller
public class TableController{
	@Autowired
	private StarRepository unitRepository;
	@GetMapping("/")
	public String showTable(Model m) {
		Iterable<unit> list = unitRepository.findAll();
//		for(unit unit: list) {
//			System.out.println(unit.getName());
//		}
		m.addAttribute("unit", list);
		return "index"; // 타임리프 설치
	}
}
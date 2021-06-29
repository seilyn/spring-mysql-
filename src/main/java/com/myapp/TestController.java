package com.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class TestController {
	@Autowired
	private StarRepository starRepository;
	@GetMapping("/")
	public String home() {
		return "Success";
	}
	
	@GetMapping("/unit")
	public @ResponseBody Iterable<unit> getAllUnits() {
		return starRepository.findAll();
	}
}
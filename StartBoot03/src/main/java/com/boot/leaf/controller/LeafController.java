package com.boot.leaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeafController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name","Tymeleaf");
		return "hello";
	}
	
	@GetMapping("/util")
	public String util() {
		return "utility";
	}
	
	@GetMapping("/expr")
	public String expression(Model model, HttpSession session) {
		model.addAttribute("name", "이창진");
		
		model.addAttribute("dto", new LeafDto("Java",1));
		
		List<LeafDto> list = new ArrayList<LeafDto>();
		list.add(new LeafDto("DataBase", 2));
		list.add(new LeafDto("HTML/CSS", 3));
		model.addAttribute("list", list);
	
		session.setAttribute("pw", "session value");
		
		return "expression";
	}
	
	@GetMapping("/static")
	public String staticTest() {
		return "static";
	}
}

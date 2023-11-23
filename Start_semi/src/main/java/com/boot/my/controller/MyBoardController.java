package com.boot.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.my.model.biz.MyBiz;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {
	
	@Autowired
	private MyBiz myBiz;
	
	@RequestMapping("/list")
	public String selectList(Model model) {
		model.addAttribute("list", myBiz.selectList());
		
		return "myboardlist";
	}
	

}

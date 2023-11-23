package com.boot.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.my.model.biz.MyBiz;
import com.boot.my.model.dto.MyDto;

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
	
	@GetMapping("/insertform")
	public String insertForm() {
		return "myboardinsert";
	}
	
	@PostMapping("/insert")
	public String insert(MyDto dto) {
		int res = myBiz.insert(dto);
		
		if(res>0) {
			return "redirect:/myboard/list";
		}else {
			return "redirect:/myboard/insertform";
		}
	}
	
	@GetMapping("/detail")
	public String selectOne(Model model, int myno) {
		model.addAttribute("dto", myBiz.selectOne(myno));
		return "myboarddetail";
	}
	
	@GetMapping("/updateform")
	public String updateForm(Model model, int myno) {
		model.addAttribute("dto", myBiz.selectOne(myno));
		return "myboardupdate";
	}
	
	@PostMapping("/update")
	public String updateRes(MyDto dto) {
		//update 성공 후
		//성공하면 list 실패하면 update화면으로 응답		
		if(myBiz.update(dto)>0) {
			return "redirect:/myboard/list";
		}else {
			return "redirect:/myboard/updateform?myno="+dto.getMyno();
		}
	}
	
	@GetMapping("/delete")
	public String delete(int myno) {
		if(myBiz.delete(myno)>0) {
			return "redirect:/myboard/list";
		}else {
			return "redirect:/myboard/detail?myno=" + myno;
		}
	}

}

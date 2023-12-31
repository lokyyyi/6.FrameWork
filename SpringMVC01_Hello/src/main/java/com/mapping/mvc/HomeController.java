package com.mapping.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mapping.mvc.dto.AddressDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/command.do", method=RequestMethod.GET)
	public String getCommand(Model model, String name, @RequestParam("addr")String address, String phone) {
		//System.out.println(name);
		//System.out.println(address);
		//System.out.println(phone);
			
		model.addAttribute("dto", new AddressDto(name,address,phone));
		return "getCommand";
	}
	@RequestMapping(value="/command.do", method=RequestMethod.POST)
	public String postCommand(Model model, @ModelAttribute AddressDto dto) {	//dto class 생성자 자동 실행 후 , field값과 parameter이름 값이 같은 세터 자동 실행
//		System.out.println(dto.getName());
//		System.out.println(dto.getAddr());
//		System.out.println(dto.getPhone());
		
		model.addAttribute("dto", dto);
		return "postCommand";
	}
	
	
}

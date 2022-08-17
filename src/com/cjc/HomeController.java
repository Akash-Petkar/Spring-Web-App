package com.cjc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{

	@RequestMapping("/reg")
	public String prelogin()
	{
		System.out.println("This is prelogin controller");
		return "success";
	}
	
	
	@RequestMapping(value = "*")
	public String errorpage()
	{
		return "error";
	}
}

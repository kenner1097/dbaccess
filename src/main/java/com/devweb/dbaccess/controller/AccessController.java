package com.devweb.dbaccess.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/access")
public class AccessController {
	
	@GetMapping("/register")
	public String register () {
		return "register_html";
	}
}

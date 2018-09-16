package com.devweb.dbaccess.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devweb.dbaccess.entity.register;


@Controller
@RequestMapping("/access")
public class AccessController {
	
	@GetMapping("/register")
	public String Newregister (Model model) {
		List<register> registro = new ArrayList<>();
		
		return "register_html";
	}

}

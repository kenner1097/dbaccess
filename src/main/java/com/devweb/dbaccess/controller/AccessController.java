package com.devweb.dbaccess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devweb.dbaccess.entity.Register;
import com.devweb.dbaccess.repository.RegisterJpaRepository;


@Controller
@RequestMapping("/access")
public class AccessController {
	
	@Autowired
	@Qualifier("registerJpaRepository")
	private RegisterJpaRepository registerJpa;
	
	@GetMapping("/registrar")
	public String Newregister (Model model) {
		model.addAttribute("register", new Register());
		return "register_html";
	}
	
	@PostMapping("/registrar")
	public String Newregister (Register reg) {
		registerJpa.save(reg);
		return "endregister_html";
	}

}

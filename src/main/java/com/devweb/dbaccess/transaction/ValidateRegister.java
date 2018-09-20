package com.devweb.dbaccess.transaction;

import com.devweb.dbaccess.entity.Register;
import  com.devweb.dbaccess.repository.RegisterJpaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class ValidateRegister {
	
	@Autowired
	@Qualifier("registerJpaRepository")
	private RegisterJpaRepository registerJpa;
	
	public String validateRegister() {
		@SuppressWarnings("unused")
		List<Register> email = registerJpa.seleccionarPorEmail(1);
		return null;
	}
	
}
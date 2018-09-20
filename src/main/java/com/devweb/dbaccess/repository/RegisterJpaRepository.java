package com.devweb.dbaccess.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devweb.dbaccess.entity.Register;



@Repository("registerJpaRepository")
public interface RegisterJpaRepository extends JpaRepository<Register, Integer>{
	
	@Query("SELECT c FROM Register c WHERE c.email= :email")
	public List<Register> seleccionarPorEmail(@Param("email") int email);

}

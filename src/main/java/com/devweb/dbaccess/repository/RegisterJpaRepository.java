package com.devweb.dbaccess.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devweb.dbaccess.entity.Register;

@Repository("registerJpaRepository")
public interface RegisterJpaRepository extends JpaRepository<Register, Integer>{

}

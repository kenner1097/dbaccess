package com.devweb.dbaccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register")
public class register {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	private String nombre;
	private String apellidos;
	private String password;
	private String roleUser;
	private String email;
	
	/**
	 * Get and Setters
	 */

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoleUser() {
		return roleUser;
	}
	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Constructors
	 */
	public register(int id, String nombre, String apellidos, String password, String roleUser, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.roleUser = roleUser;
		this.email = email;
	}
	
	public register() {
		
	}
	
}

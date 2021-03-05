package com.example.demo.clinica.model;

import org.springframework.data.annotation.Id;

public class Usuario {
	
	
	public Usuario(Integer id_usu,String usuario, String contrasena) {
		super();
		this.id_usu=id_usu;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
  @Id
 
	private Integer id_usu;

	private String usuario;
	private String contrasena;


	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Integer getID() {
		return id_usu;
	}

	public void setID(Integer id_usu) {
		this.id_usu = id_usu;
	}

	@Override
	public String toString() {
		return "usuario[" + "id_usu=" + id_usu + ", usuario=" + usuario + ", contrasena=" + contrasena + "]";
	}

}

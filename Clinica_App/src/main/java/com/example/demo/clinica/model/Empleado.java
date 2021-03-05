package com.example.demo.clinica.model;

import java.util.Set;

import org.springframework.data.annotation.Id;

public class Empleado {
	public Empleado(Integer id_em,String apellido_em, String nombre_em,Integer dni,String correo,Integer telefono_med,Set<Especialidad> id_espe) {
		super();
		this.id_med=id_med;
		this.nombre_med = nombre_med;
		this.apellido_med = apellido_med;
		this.dni = dni;
		this.vch_clieemail = vch_clieemail;
		this.telefono_med = telefono_med;
		this.id_espe = id_espe;
	}
	
  @Id
 
	
	private Integer id_med;
	private String nombre_med;
	private String apellido_med;
	private Integer dni;
	private String vch_clieemail;
	private Integer telefono_med;
	private Set<Especialidad> id_espe;
	
	public void addEspecialidad(Especialidad id_espe ) {
		this.id_espe.add(id_espe);
	}
	
	public Integer getId_med() {
		return id_med;
	}
	public void setId_med(Integer id_med) {
		this.id_med = id_med;
	}
	public String getNombre_med() {
		return nombre_med;
	}
	public void setNombre_med(String nombre_med) {
		this.nombre_med = nombre_med;
	}
	public String getApellido_med() {
		return apellido_med;
	}
	public void setApellido_med(String apellido_med) {
		this.apellido_med = apellido_med;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getVch_clieemail() {
		return vch_clieemail;
	}
	public void setVch_clieemail(String vch_clieemail) {
		this.vch_clieemail = vch_clieemail;
	}
	public Integer getTelefono_med() {
		return telefono_med;
	}
	public void setTelefono_med(Integer telefono_med) {
		this.telefono_med = telefono_med;
	}
	public Set<Especialidad> getId_espe() {
		return id_espe;
	}
	public void setId_espe(Set<Especialidad> id_espe) {
		this.id_espe = id_espe;
	}
	@Override
	public String toString() {
		return "medico[" + "id_med=" + id_med+ ", nombre_med=" + nombre_med + ", apellido_med=" + apellido_med +"dni=" + dni+"vch_clieemail=" + vch_clieemail+"telefono_med=" + telefono_med+"id_espe=" + id_espe+ "]";
	}

}

package com.example.demo.clinica.model;




import org.springframework.data.annotation.Id;
public class Paciente {
	public Paciente(Integer id_pac,String apellido_pac, String nombre_pac,Integer dni_pac,Integer telefono_pac) {
		super();
		this.id_pac=id_pac;
		this.apellido_pac = apellido_pac;
		this.nombre_pac = nombre_pac;
		this.dni_pac = dni_pac;
		this.telefono_pac= telefono_pac;
		
	}
	
  @Id
 
	private Integer id_pac;

	private String apellido_pac;
	private String nombre_pac;
	private Integer dni_pac;
	private Integer telefono_pac;
	
	public Integer getId_pac() {
		return id_pac;
	}
	public void setId_pac(Integer id_pac) {
		this.id_pac = id_pac;
	}
	public String getApellido_pac() {
		return apellido_pac;
	}
	public void setApellido_pac(String apellido_pac) {
		this.apellido_pac = apellido_pac;
	}
	public String getNombre_pac() {
		return nombre_pac;
	}
	public void setNombre_pac(String nombre_pac) {
		this.nombre_pac = nombre_pac;
	}
	public Integer getDni_pac() {
		return dni_pac;
	}
	public void setDni_pac(Integer dni_pac) {
		this.dni_pac = dni_pac;
	}
	public Integer getTelefono_pac() {
		return telefono_pac;
	}
	public void setTelefono_pac(Integer telefono_pac) {
		this.telefono_pac = telefono_pac;
	}
	@Override
	public String toString() {
		return "paciente[" + "id_pac=" + id_pac+ ", apellido_pac=" + apellido_pac + ", nombre_pac=" + nombre_pac +"dni_pac=" + dni_pac+"telefono_pac=" + telefono_pac+ "]";
	}
	
}

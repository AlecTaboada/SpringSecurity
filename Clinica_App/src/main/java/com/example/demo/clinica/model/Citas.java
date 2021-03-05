package com.example.demo.clinica.model;

import java.util.Date;
import java.util.Set;

import org.springframework.data.annotation.Id;

public class Citas {
	public Citas(Integer id_cita,Date fecha_registro, Integer orden,Integer atendido,Set<Empleado> id_em,Integer id_pro,Integer id_pac) {
		super();
		this.id_cita=id_cita;
		this.fecha_registro = fecha_registro;
		this.orden = orden;
		this.atendido = atendido;
		this.id_em = id_em;
		this.id_pro = id_pro;
		this.id_pac = id_pac;
	}
	
  @Id
 
	private Integer id_cita;

	private Date fecha_registro;
	private Integer orden;
	private Integer atendido;
	private Set<Empleado> id_em;
	private Integer id_pro;
	private Integer id_pac;
	
	public Integer getId_cita() {
		return id_cita;
	}
	public void setId_cita(Integer id_cita) {
		this.id_cita = id_cita;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public Integer getOrden() {
		return orden;
	}
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	public Integer getAtendido() {
		return atendido;
	}
	public void setAtendido(Integer atendido) {
		this.atendido = atendido;
	}
	public Set<Empleado>  getId_em() {
		return id_em;
	}
	public void setId_em(Set<Empleado>  id_em) {
		this.id_em = id_em;
	}
	public Integer getId_pro() {
		return id_pro;
	}
	public void setId_pro(Integer id_pro) {
		this.id_pro = id_pro;
	}
	public Integer getId_pac() {
		return id_pac;
	}
	public void setId_pac(Integer id_pac) {
		this.id_pac = id_pac;
	}
	@Override
	public String toString() {
		return "medico[" + "id_cita=" + id_cita+ ", fecha_registro=" + fecha_registro + ", orden=" + orden +"atendido=" + atendido+"id_em=" + id_em+"id_pro=" + id_pro+"id_pac=" + id_pac+ "]";
	}
	
}

package com.example.demo.clinica.model;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class Turno {
	public Turno(Integer id_turn ,Date feche_ini, Date fecha_salida) {
		super();
		this.id_turn=id_turn;
		this.feche_ini = feche_ini;
		this.fecha_salida = fecha_salida;
	}
	
  @Id
 
	private Integer id_turn;

	private Date feche_ini;
	private Date fecha_salida;
	
	public Integer getId_turn() {
		return id_turn;
	}
	public void setId_turn(Integer id_turn) {
		this.id_turn = id_turn;
	}
	public Date getFeche_ini() {
		return feche_ini;
	}
	public void setFeche_ini(Date feche_ini) {
		this.feche_ini = feche_ini;
	}
	public Date getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	@Override
	public String toString() {
		return "turno[" + "id_turn=" + id_turn + ", feche_ini=" + feche_ini + ", fecha_salida=" + fecha_salida + "]";
	}


	
}

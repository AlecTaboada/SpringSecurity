package com.example.demo.clinica.model;
import java.util.Date;

import org.springframework.data.annotation.Id;


public class Especialidad {
	
		public Especialidad(Integer id_espe ,String nombre_espe, Integer capacidad) {
			super();
			this.id_espe=id_espe;
			this.nombre_espe = nombre_espe;
			this.capacidad = capacidad;
		}
		
	  @Id
	 
		private Integer id_espe;

		private String nombre_espe;
		private Integer capacidad;
		
		public Integer getId_espe() {
			return id_espe;
		}
		public void setId_espe(Integer id_espe) {
			this.id_espe = id_espe;
		}
		public String getNombre_espe() {
			return nombre_espe;
		}
		public void setNombre_espe(String nombre_espe) {
			this.nombre_espe = nombre_espe;
		}
		public Integer getCapacidad() {
			return capacidad;
		}
		public void setCapacidad(Integer capacidad) {
			this.capacidad = capacidad;
		}
		@Override
		public String toString() {
			return "turno[" + "id_espe=" + id_espe + ", nombre_espe=" + nombre_espe + ", capacidad=" + capacidad + "]";
		}
	

}

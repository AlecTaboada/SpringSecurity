package com.example.demo.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clinica.model.Usuario;
import com.example.demo.clinica.service.IUsuarioService;
import com.example.demo.clinica.service.UsuarioService;



@Controller

public class UsuarioController {
	
	@Autowired
	private IUsuarioService iusuarioService;
	private UsuarioService usuarioService;
	@GetMapping
	public List<Usuario> traerTodos() {
		return usuarioService.traerTodos();
	}
	@PostMapping("/validate")
	public String verificarForm(String usuario,String contrasena) {
		Usuario usu;
		
		 usu =  iusuarioService.verificar(usuario,contrasena);
		if (usu == null) {
			return "redirect:/rechasado";

		}
		return "redirect:/main";
	
	}
	
	@PostMapping("/insert")
	public String InsertarForm(String usuario, String contrasena) {
		Usuario usu;
		 usu =  iusuarioService.insert(usuario,contrasena);
		 if (usu == null) {
				return "Insercion fallida";

			}
		return "Insercion exitosa";
	}
	@PostMapping("/delete")
	public String DeleteForm(Integer id_usu) {
		
		 iusuarioService.delete(id_usu);
		 return "El usuario a sido eliminado";
	
	}
	@PostMapping("/update")
	public String UpdateForm(Integer id_usu,String usuario, String contrasena,Usuario usu) {
		
		
	
		usu.setID(id_usu);
		usu=iusuarioService.actualizar(id_usu,usuario,contrasena);
		 return "El usuario a sido actualizado";
	
	}
	

	@GetMapping("/main")
	public String menu() {
		return "main";
	}

	@GetMapping("/log")
	public String login() {
		return "log";
	}

	@GetMapping("/rechasado")
	public String rechasado() {
		return "rechasado";
	}

}

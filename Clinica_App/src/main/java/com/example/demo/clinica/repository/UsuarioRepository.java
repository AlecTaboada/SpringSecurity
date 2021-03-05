package com.example.demo.clinica.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.clinica.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	Usuario findByUsuarioAndContrasena(String usuario,String contrasena);
	Usuario findByUsuario(String usuario);
}


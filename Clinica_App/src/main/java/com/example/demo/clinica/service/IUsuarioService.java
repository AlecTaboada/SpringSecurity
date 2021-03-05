package com.example.demo.clinica.service;

import java.util.List;

import com.example.demo.clinica.model.Usuario;



public interface IUsuarioService {
Usuario verificar(String usuario,String contrasena);
Usuario insert(String usuario,String contrasena);
void delete(Integer id_usu);
Usuario actualizar(Integer id_usu,String usuario,String contrasena);
 List<Usuario> traerTodos();
}

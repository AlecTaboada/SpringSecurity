package com.example.demo.clinica.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.example.demo.clinica.model.Usuario;
import com.example.demo.clinica.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import com.example.demo.clinica.model.Usuario;
import com.example.demo.clinica.repository.UsuarioRepository;

@Service

public class UsuarioService implements IUsuarioService,UserDetailsService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Usuario> traerTodos(){
		String sql = "SELECT "
				+ "id_usu    id_usu ,"
				+ "usuario   usuario,"
				+ "contrasena  contrasena,"
				
				+ "FROM usuario";
		List<Usuario> lista;
		lista = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Usuario.class) );
		return lista;
	}
		@Autowired
		private UsuarioRepository usuarioRepository;
		
		@Override
		public Usuario verificar(String usuario,String contrasena) {
			Usuario user=usuarioRepository.findByUsuarioAndContrasena(usuario,contrasena);
		
			
			if (user != null) {
				return user;
			}
			return null;
		}

		@Override
		public Usuario insert(String usuario, String contrasena) {
			Usuario user= usuarioRepository.save(new Usuario(null,usuario,contrasena));

			if (user != null) {
				return user;
			}
			return null;
		}

		@Override
		public void delete(Integer id_usu) {
			
			 usuarioRepository.deleteById(id_usu);
		}
		
		
	

		@Override
		public Usuario actualizar(Integer id_usu, String usuario, String contrasena) {
			Usuario user= usuarioRepository.save(new Usuario(id_usu,usuario,contrasena));

			if (user != null) {
				return user;
			}
			return null;
		
		}

	


@Override
		public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
			Usuario us = usuarioRepository.findByUsuario(usuario);
			List<GrantedAuthority> roles = new ArrayList<>();
			roles.add(new SimpleGrantedAuthority("ADMIN"));
			UserDetails userDet = new User(us.getUsuario(),us.getContrasena(),roles);
			return userDet;
		}
	

}

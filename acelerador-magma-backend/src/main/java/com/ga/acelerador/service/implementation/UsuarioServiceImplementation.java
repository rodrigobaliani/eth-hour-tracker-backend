package com.ga.acelerador.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ga.acelerador.model.Usuario;
import com.ga.acelerador.repository.UsuarioRepository;
import com.ga.acelerador.service.UsuarioService;

public class UsuarioServiceImplementation implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public Usuario get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario save(Usuario request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario update(Long id, Usuario request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}

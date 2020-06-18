package com.ga.acelerador.service;

import java.util.List;

import com.ga.acelerador.model.Usuario;

public interface UsuarioService {
	
	Usuario get(Long id);
	List<Usuario> getAll();
	Usuario save(Usuario request);
	Usuario update(Long id, Usuario request);
	boolean delete(Long id);
}

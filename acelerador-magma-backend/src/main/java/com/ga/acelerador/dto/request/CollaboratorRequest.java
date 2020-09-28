package com.ga.acelerador.dto.request;

import com.ga.acelerador.dto.request.AbstractEntityRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CollaboratorRequest extends AbstractEntityRequest  {
	private String legajo;
	private String mail;
	private String nombre;
	private String rol;
	private String cargaHoraria;
}

package com.ga.acelerador.dto.response;



public class CollaboratorResponse extends AbstractEntityResponse{
	private String legajo;
	private String mail;
	private String nombre;
	private String rol;
	private String cargaHoraria;
	
	public CollaboratorResponse(Long id, String legajo, String mail, String nombre, String rol, String cargaHoraria) {
		super(id);
		this.legajo = legajo;
		this.mail = mail;
		this.nombre = nombre;
		this.rol = rol;
		this.cargaHoraria = cargaHoraria;
	}
	public CollaboratorResponse() {
		
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	

}

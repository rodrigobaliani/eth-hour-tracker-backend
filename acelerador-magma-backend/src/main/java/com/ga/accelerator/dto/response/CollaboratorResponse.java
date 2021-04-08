package com.ga.accelerator.dto.response;

public class CollaboratorResponse extends AbstractEntityResponse{
	private String file;
	private String mail;
	private String name;
	private String role;
	private String workload;
	
	public CollaboratorResponse(Long id, String file, String mail, String name, String role, String workload) {
		super(id);
		this.file = file;
		this.mail = mail;
		this.name = name;
		this.role = role;
		this.workload = workload;
	}
	public CollaboratorResponse() {
		
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getWorkload() {
		return workload;
	}
	public void setWorkload(String workload) {
		this.workload = workload;
	}
	
	

}

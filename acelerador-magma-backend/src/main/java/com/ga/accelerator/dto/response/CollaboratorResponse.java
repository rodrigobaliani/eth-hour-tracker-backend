package com.ga.accelerator.dto.response;



public class CollaboratorResponse extends AbstractEntityResponse{
	private String file;
	private String mail;
	private String name;
	private String rolee;
	private String workload;
	
	public CollaboratorResponse(Long id, String file, String mail, String name, String rolee, String workload) {
		super(id);
		this.file = file;
		this.mail = mail;
		this.name = name;
		this.rolee = rolee;
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
	public String getrolee() {
		return rolee;
	}
	public void setrolee(String rolee) {
		this.rolee = rolee;
	}
	public String getWorkload() {
		return workload;
	}
	public void setWorkload(String workload) {
		this.workload = workload;
	}
	
	

}

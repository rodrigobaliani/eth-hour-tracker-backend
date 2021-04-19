package com.ga.accelerator.dto.response;

import lombok.Getter;

import lombok.Setter;



@Getter
@Setter
public class AbstractEntityResponse {

	private Long id;

	public AbstractEntityResponse(Long id) {
		this.id = id;
	}
	
	public AbstractEntityResponse() {
		
	}
	
}

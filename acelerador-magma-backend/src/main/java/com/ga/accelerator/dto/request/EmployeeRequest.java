package com.ga.accelerator.dto.request;

import com.ga.accelerator.dto.request.AbstractEntityRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest extends AbstractEntityRequest  {
	private String file;
	private String mail;
	private String name;
	private String role;
	private String workload;
}

package com.ga.accelerator.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GlowContractRequest extends AbstractEntityRequest  {

	private String name;
	private String description;
	
}

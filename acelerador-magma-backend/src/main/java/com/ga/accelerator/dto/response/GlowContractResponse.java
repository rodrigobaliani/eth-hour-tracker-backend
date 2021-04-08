package com.ga.accelerator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GlowContractResponse extends AbstractEntityResponse{
	private String name;
	private String description;

}

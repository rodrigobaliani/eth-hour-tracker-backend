package com.ga.accelerator.dto.response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AbstractEntityResponse {

	private Long id;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/*public AbstractEntityResponse(Long id) {
		this.id = id;
	}
	public AbstractEntityResponse() {
	}*/

}

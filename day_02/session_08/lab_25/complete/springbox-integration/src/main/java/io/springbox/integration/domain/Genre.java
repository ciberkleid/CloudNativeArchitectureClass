package io.springbox.integration.domain;



public class Genre {
	

	private Long id;
	

	private String mlId;
	

	private String name;
	

	public Long getId() {
		return id;
	}

	public String getMlId() {
		return mlId;
	}

	public String getName() {
		return name;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setMlId(String mlId) {
		this.mlId = mlId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


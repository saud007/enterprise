package com.digivalet.userregistration.user;

public class User {

	private Long id;
	private String name;
	private String email;
	private String domain;
	private int experiance;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(Long id, String name, String email, String domain, int experiance) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.domain = domain;
		this.experiance = experiance;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", domain=" + domain + ", experiance="
				+ experiance + "]";
	}
	 
}

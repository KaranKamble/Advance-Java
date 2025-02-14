package com.dac;

public class PersonImpl implements Person {
	private String name;
	private String email;
	private String city;
	
	public PersonImpl() {
		System.out.println("PersonImpl.PersonImpl() called");
	}

	public PersonImpl(String name, String email, String city) {
		this.name = name;
		this.email = email;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "PersonImpl [name=" + name + ", email=" + email + ", city=" + city + "]";
	}

}

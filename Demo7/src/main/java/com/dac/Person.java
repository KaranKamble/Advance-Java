package com.dac;

import org.springframework.stereotype.Component;

//@Component
public class Person {
	private String name;
	private String email;
	private String city;
	private float salary;
	private BirthDate birthDate;

	public Person() {
		this.name = "satya";
		this.email = "satya@gmail.com";
	}

	
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

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

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public BirthDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", city=" + city + ", salary=" + salary + ", birthDate="
				+ birthDate + "]";
	}

}

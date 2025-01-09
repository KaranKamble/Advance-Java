package com.dac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersonContact {

	@Value("#{p1.name}")		//Internally calls p1.getName() of Person
	private String personName;

//	@Value("#{p1.email}")		//Internally calls p1.getEmail() of Person
	@Value("#{p1.getEmail()}")	
	private String personEmail;
	
	

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	@Override
	public String toString() {
		return "PersonContact [personName=" + personName + ", personEmail=" + personEmail + "]";
	}

}

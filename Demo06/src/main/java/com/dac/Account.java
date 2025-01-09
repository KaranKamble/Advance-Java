package com.dac;

public interface Account {

	void setId( int id );
	void setType( String type );
	void setBalance( double balance );
	void setAccHolder(Person accHolder);
	void setLogger(Logger logger);
	
	int getId();
	String getType();
	double getBalance();
	Person getAccHolder();
	Logger getLogger();
	
	double deposite( double amount );
	double withdraw( double amount );
	
}

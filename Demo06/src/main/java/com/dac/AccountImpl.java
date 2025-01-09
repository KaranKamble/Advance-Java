package com.dac;

public class AccountImpl implements Account {
	private int id;
	private String type;
	private double balance;

	private Logger logger;
	private Person accHolder;

	public AccountImpl() {
		System.out.println("AccountImpl.AccountImpl()");
	}

	public AccountImpl(int id, String type, double balance) {
		this.id = id;
		this.type = type;
		this.balance = balance;
	}

	public AccountImpl(int id, String type, double balance, Logger logger, Person accHolder) {
		this.id = id;
		this.type = type;
		this.balance = balance;
		this.logger = logger;
		this.accHolder = accHolder;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public Logger getLogger() {
		return logger;
	}

	@Override
	public double deposite(double amount) {
		if (this.logger != null) {
			this.logger.log("Rs. " + amount + " is deposited to account No." + this.id);
		}
		return this.balance = amount + this.balance;
	}

	@Override
	public double withdraw(double amount) {
		if (this.logger != null) {
			this.logger.log("Rs. " + amount + " is withdraw from account No." + this.id);
		}
		return this.balance = this.balance - amount;
	}

	@Override
	public String toString() {
		return "AccountImpl [id=" + id + ", type=" + type + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	

}

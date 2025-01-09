package com.test;

public class AccountServiceImpl implements AccountService {
	private int id;
	private String type;
	private double balance;
	private Logger logger;

	public AccountServiceImpl() {
	}

	public AccountServiceImpl(int id, String type, double balance) {
		this.id = id;
		this.type = type;
		this.balance = balance;
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

	@Override
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public Logger getLogger() {
		return logger;
	}

	@Override
	public void deposite(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Deposited "+amount);
		logger.log("Deposited "+amount);
	}

	@Override
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		System.out.println("Withdraw "+amount);
		logger.log("Withdraw "+amount);
	}

}

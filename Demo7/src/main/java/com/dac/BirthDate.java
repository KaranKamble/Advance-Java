package com.dac;

public class BirthDate {
	private int day;
	private int month;
	private int year;

	public BirthDate() {
		this.day = 12;
		this.month = 12;
		this.year = 2012;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "BirthDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}

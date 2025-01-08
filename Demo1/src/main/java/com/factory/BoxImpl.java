package com.factory;

public class BoxImpl {

	private int lenght;
	private int height;
	private int breadth;

	public BoxImpl() {
		System.out.println("Inside BoxImpl()");
	}

	public BoxImpl(int lenght, int height, int breadth) {
		System.out.println("Inside BoxImpl( int, int, int )");
		this.lenght = lenght;
		this.height = height;
		this.breadth = breadth;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		System.out.println("Inside BoxImpl.setLenght()");
		this.lenght = lenght;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		System.out.println("Inside BoxImpl.setHeight()");
		this.height = height;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		System.out.println("Inside BoxImpl.setBreadth()");
		this.breadth = breadth;
	}
	
	public int calculateVol() {
		return this.lenght * this.breadth * this.height;
	}
	
}

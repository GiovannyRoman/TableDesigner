package com.test.Tables;

import java.util.ArrayList;

import compartments.Compartment;

public abstract class Table {
	private String shape;
	private int legs;
	private ArrayList<Compartment> compartments;
	private int quantity;
	
	public abstract int getArea();
	
	public boolean isConnected() {
	//need todo
		return false;
	}
	
	public void setOnClip() {
		
	}
	
	public void setOnHover() {
		
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public ArrayList<Compartment> getCompartments() {
		return compartments;
	}

	public void setCompartments(ArrayList<Compartment> compartments) {
		this.compartments = compartments;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

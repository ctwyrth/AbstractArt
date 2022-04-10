package com.ctwyrth.abstractart;

public class Sculpture extends Art {
	// MEMBER VARIABLES
	private String material;
	
	
	// CONSTRUCTORS
	public Sculpture(String m) {
		this.material = m;
	}

	
	// GETTERS & SETTERS
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	// METHODS
	@Override
	public void viewArt() {
		System.out.println("TITLE: " + super.getTitle());
		System.out.println("SCULPTOR: " + super.getAuthor());
		System.out.println("MATERIAL: " + this.material);
		System.out.println("DESCRIPTION: " + super.getDescription());
	}	
}

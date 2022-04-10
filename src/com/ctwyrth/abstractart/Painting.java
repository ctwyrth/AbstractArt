package com.ctwyrth.abstractart;

public class Painting extends Art {
	// MEMBER VARIABLES
	private String paintType;


	// CONSTRUCTS
	public Painting(String p) {
		this.paintType = p;
	}
	

	// SETTERS & GETTERS
	public String getPaintType() {
		return paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	
	// METHODS
	@Override
	public void viewArt() {
		System.out.println("TITLE: " + super.getTitle());
		System.out.println("PAINTER: " + super.getAuthor());
		System.out.println("PAINTING STYLE: " + this.paintType);
		System.out.println("DESCRIPTION: " + super.getDescription());
	}
}

	

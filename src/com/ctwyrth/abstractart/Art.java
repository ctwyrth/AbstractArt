package com.ctwyrth.abstractart;

public abstract class Art {
	// MEMBER VARUABLES
	private String title;
	private String author;
	private String description;
	
	
	// COSTRUCTS
	
	
	// GETTERS & SETTERS
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	// METHODS
	public abstract void viewArt();
}

package model;

public abstract class Animal{
	
	protected String name; 
	private int years; 

	public Animal(String name) {
		this.name = name; 
	}

	public Animal(){
		this.name = "Jhon"; 
	}

	public Animal(int years, String name) {
		this.years = years; 
		this.name = name; 
	}

	public String getName(){
		return this.name; 
	}

	public abstract String communication();


}

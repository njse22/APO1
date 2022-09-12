package model; 


public class Person{
	
	private String name; 
	private int years; 
	private String id; 

	public Person(String aname, int ayears, String aid){
		name = aname; 
		years = ayears; 
		id = aid; 
	}

	public String getName(){
		return name; 
	}

	public void setName(String aname){
		name = aname; 
	}

	public int getYears(){
		return years; 
	}


	public String getId(){
		return id; 
	}
}

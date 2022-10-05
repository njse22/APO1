package model; 


public class Person{
	
	private String name; 
	private int years; 
	private String id; 
	private TypePerson type; 

	public Person(String aname, int ayears, String aid){
		name = aname; 
		years = ayears; 
		id = aid; 
		// llamado al método que calcula el tipo de persona. 
		// el método hace modificación del atributo type
		// como es una "variable general" se puede modificar en
		// cualquier parte del código (el atributo). 
		setTypePerson();
		// esto no debería de ir acá ... estoy 
		// imprimiendo la información del usuario 
		// recien creado ... estoy usando un "truco" 
		// con la herencia ... en la unidad 3 lo veremos mejor ...
		System.out.println(this);
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

	public void setTypePerson(){
		if(years > 0 && years <= 14){
			type = TypePerson.CHILD; 
		}
		else if(years >= 15 && years <= 17){
			type = TypePerson.YOUNGTH; 
		}
		else if(years >= 18 && years <= 60){
			type = TypePerson.ADULT; 
		}
		else{
			type = TypePerson.OLD; 
		}
	}

	public String toString(){
		return 
			"Nombre: " + this.name + "\n" +
			"Edad: " + this.years + "\n" + 
			"Id: " + this.id + "\n" + 
			"Person Type: " + this.type; 


	}

}

package model; 

public class SolarSystem{

	public static final int SOLAR_SYSTEM_SIZE = 8; 

	private Planet[] planets; 

	public SolarSystem() {
		System.out.println("Hola desde el constructor de solar system"); 
		planets = new Planet[SOLAR_SYSTEM_SIZE]; 
		planets[0]=new Planet("Mercurio",0,0.4,88);
		planets[1]=new Planet("Venus",0,0.7,225);
		planets[2]=new Planet("Tierra",1,1,365.25);
		planets[3]=new Planet("Marte",2,1.5,1.88);
		planets[4]=new Planet("Jupiter",79,5.2,11.86);
		planets[5]=new Planet("Saturno",62,9.5,29.45);
		planets[6]=new Planet("Urano",27,19.8,84);
		planets[7]=new Planet("Neptuno",14,30.1,164.81);
	}

	public String toString(){
		return "Hola desde Solar System"; 
	}

	public Planet[] getPlanets(){
		return planets; 
	}

	public String addPersonToPlanet(String namePerson, int yearsPerson, String personId, String namePlanet){
		String msj = "No se pudo agregar una person"; 
		Person newPerson = new Person(namePerson, yearsPerson, personId); 
		int posPlanet = searchPlanetByName(namePlanet); 
		if(posPlanet != -1 ){
			msj = planets[posPlanet].addPersonWithObject(newPerson); 
		}
		return msj; 
	}

	public boolean callHasEmptyPos(String namePlanet){
		boolean isEmpty = false; 
		int posPlanet = searchPlanetByName(namePlanet); 
		if(posPlanet != -1){ // ! = 
			isEmpty = planets[posPlanet].hasEmptyPos(); 
		}
		return isEmpty; 
	}

	public int searchPlanetByName(String planetName){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < SOLAR_SYSTEM_SIZE && !isFound; i++ ){
			if(planets[i].getName().equals(planetName)){
				pos = i; 
				isFound = true; 
			}
		}
		return pos; 
	}

}

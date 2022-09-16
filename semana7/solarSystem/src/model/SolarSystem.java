package model; 

public class SolarSystem{

	public static final int SOLAR_SYSTEM_SIZE = 8; 

	private Planet[] planets; 

	public SolarSystem() {
		System.out.println("Hola desde el constructor de solar system"); 
		planets = new Planet[SOLAR_SYSTEM_SIZE]; 
		planets[0] = new Planet("Mercury", 0, 0.4, 88); 
	}

	public String toString(){
		return "Hola desde Solar System"; 
	}

	public Planet[] getPlanets(){
		return planets; 
	}

}

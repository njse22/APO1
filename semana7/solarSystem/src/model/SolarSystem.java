package model; 

public class SolarSystem{

	public static final int SOLAR_SYSTEM_SIZE = 8; 

	private Planet[] planets; 

	public SolarSystem() {
		planets = new Planet[SOLAR_SYSTEM_SIZE]; 
		planets[0] = new Planet("Mercury", 0, 0.4, 88); 
	}
}

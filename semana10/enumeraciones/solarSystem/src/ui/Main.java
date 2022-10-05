package ui; 

import java.util.Scanner;
import model.SolarSystem; 

public class Main{

	private Scanner reader; 
	private SolarSystem solarSystem; 

	public Main(){
		reader = new Scanner(System.in); 
		solarSystem = new SolarSystem(); 

	}

	public String toString(){
		return "Hola desde la clase Main"; 
	}

	public SolarSystem getSolarSystem(){
		return solarSystem; 
	}

	public Scanner getReader(){
		return reader;
	}

	public static void main(String[] args){
		// creación del objeto. 
		Main main = new Main(); 
		// llamdo a uno de los metodos de la clase. 
		String msj = main.toString(); 
		System.out.println(msj); 
		int option = 0; 

				do{

					option = main.getOptionShowMenu(); 
					main.executeOption(option);

				}while(option != 0);

				main.getReader().close();
	}
	
	public int getOptionShowMenu(){
		int option = 0; 
		System.out.println("<<<<< Welcome to Store >>>>>");
		System.out.println(
				"1. Add Person\n" +
				"0. Exit. ");
		option = reader.nextInt(); 

		return option; 
	}

	public void executeOption(int option){
		String namePerson = ""; 
		int yearsPerson = 0; 
		String idPerson = ""; 
		String namePlanet = ""; 

		switch(option){
			case 1: 
			System.out.println("type name planet"); 
			namePlanet = reader.next(); 
			boolean isEmpty = solarSystem.callHasEmptyPos(namePlanet); 
			if(isEmpty){
				// petición de la información necesaria  
				System.out.println("type name person"); 
				namePerson = reader.next(); 
				System.out.println("Type years: "); 
				yearsPerson = reader.nextInt();
				System.out.println("Type Id"); 
				idPerson = reader.next(); 
				// llamado a la operación de agregar 
				String msj = solarSystem.addPersonToPlanet(namePerson, yearsPerson, idPerson, namePlanet); 
				System.out.println(msj); 
			}
			else{
				System.out.println("No se puede agregar a la persona"); 
			}

				break; 

			case 2: 
				
				break; 

			case 3: 
				
				break; 

			case 4: 
				

				break; 

			case 5: 
				
				break; 

			case 0: 
				System.out.println("Exit program.");
				break; 

			default: 
				System.out.println("Invalid Option");
				break; 
		}
	}



}

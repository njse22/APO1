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

		switch(option){
			case 1: 
				// 
			System.out.println("type name person"); 
			namePerson = reader.next(); 
			System.out.println("Type years: "); 
			yearsPerson = reader.nextInt();
			System.out.println("Type Id"); 
			idPerson = reader.next(); 
			String msj = solarSystem.getPlanets()[0].addPerson(namePerson, yearsPerson, idPerson);
			System.out.println(msj); 

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

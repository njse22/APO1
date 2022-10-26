package model;

import java.util.ArrayList;

public class AnimalController {

	private ArrayList<Animal> animals; 

	public AnimalController() {
		animals = new ArrayList<Animal>(20);

	}	

	public ArrayList<Animal> getAnimals(){
		return animals;
	}

	public boolean addAnimal(Animal animal){
		return animals.add(animal);
	}

	public String showEntities(){

		String msj = ""; 
		for (int i = 0; i < animals.size(); i++) {
			// la palabra reservada instanceof me valida si 
			// un objeto es una instancia de una clase 

			msj += animals.get(i).toString() + "\n";
		}
		return msj;
	}
	
	public String printArray(){
		String msj = "";
		for (int i = 0; i < animals.size(); i++) {
			msj += animals.get(i).toString() + "\n"; 
		}
		return msj;
	}
	

}

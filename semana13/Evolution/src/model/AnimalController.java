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

	public String showHumans(){

		String msj = ""; 
		for (int i = 0; i < animals.size(); i++) {
			// la palabra reservada instanceof me valida si 
			// un objeto es una instancia de una clase 
			if(animals.get(i) instanceof Human){
				// está operación es un un down casting 
				// "transformando un objeto de tipo Animal 
				// a una instancia de tipo Human.
				msj += ( ( Human )( animals.get(i) ) ).jump(2.3);
			}
		}
		return msj;
	}

	public void factoryAnimalWithEnumeration(double weight, double height, int age, String name,
			boolean isDomestic, Species species, 
			double wingSpan, AnimalType animalType){

		Animal newAnimal = null; 
		switch(animalType){
			case HUMAN:
				newAnimal = new Human(weight, height, age, name); 
				break;

			case FELINDAE:
				newAnimal = new Felidae(weight, height, age, name, species); 
				break; 

			case CHICKEN:
				newAnimal= new Chicken(weight, height, age, wingSpan); 
				break; 

			case DUCK:
				newAnimal= new Duck(weight, height, age, wingSpan); 
				break; 

		}

		addAnimal(newAnimal); 

	}

	public String factoryAnimalWithString(double weight, double height, int age, String name,
			Species species, 
			double wingSpan, String animalType){

		Animal newAnimal = null;
		String msj = ""; 

		if(animalType.equalsIgnoreCase("humano")){
			newAnimal = new Human(weight, height, age, name); 
			msj = "nuevo humano creado";
		}
		else if(animalType.equalsIgnoreCase("felino")){
			newAnimal = new Felidae(weight, height, age, name, species);
			msj = "nuevo felino creado";
		}
		else if(animalType.equalsIgnoreCase("pollo")){
			newAnimal= new Chicken(weight, height, age, wingSpan); 
			msj = "nuevo pollo creado";
		}
		else if(animalType.equalsIgnoreCase("pato")){
			newAnimal= new Duck(weight, height, age, wingSpan); 
			msj = "nuevo pato creado";
		}
		else {
			msj = "Escriba un tipo de animal valido"; 
		}

		addAnimal(newAnimal); 
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

package model;

import java.util.ArrayList;

public class AnimalController {

	private ArrayList<Animal> animals;

	public AnimalController() {
		animals = new ArrayList<Animal>(20);

	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public boolean addAnimal(Animal animal) {
		return animals.add(animal);
	}

	public String showHumans() {

		String msj = "";
		for (int i = 0; i < animals.size(); i++) {
			// la palabra reservada instanceof me valida si
			// un objeto es una instancia de una clase
			if (animals.get(i) instanceof Human) {
				// está operación es un un down casting
				// "transformando un objeto de tipo Animal
				// a una instancia de tipo Human.
				msj += ((Human) (animals.get(i))).jump(2.3);
			}
		}
		return msj;
	}

	public String printArray() {
		String msj = "";
		for (int i = 0; i < animals.size(); i++) {
			msj += animals.get(i).toString() + "\n";
		}
		return msj;
	}

	public String showBird() {
		String msj = "";
		for (int i = 0; i < animals.size(); i++) {

			if (animals.get(i) instanceof Bird) {
				msj = ((Bird) (animals.get(i))).communication();

			}
		}
		return msj;
	}

	public String showFelidae() {
		String msj = "";
		for (int i = 0; i < animals.size(); i++) {

			if (animals.get(i) instanceof Felidae) {
				msj = ((Felidae) (animals.get(i))).jump(5.2);

			}
		}
		return msj;
	}
}

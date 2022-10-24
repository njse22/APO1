package model;

public class Human extends Mammal implements IMove{

	public Human(double weight, double height, int age, String name) {
		super(weight, height, age, name);
		/** la palabra reservada super llama al (los) constructor(es) de la(s) */
		/**   clase(s) superior(es) */

	}

	/** la etiqueta '@Override' indica que el metodo ha sido sobre escrito */
	/**   de la clase superior   */
	@Override
	public String communication() {
		return "I'm only human after all ...";
	}

	/** todas las clases de java heredan por defecto de 'Object' el  */
	/**     metodo toString es un metodo abstracto de Object */
	public String toString(){
		return "name: " + super.getName();

	}

	@Override
	public String jump(double km){
		return "I jumping " + km + "km"; 
	}

	@Override
	public String run(double km){
		return "I running away for " + km + "km"; 
	}



}


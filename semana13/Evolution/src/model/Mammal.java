package model;

public abstract class Mammal extends Animal implements IMove{

	private String name;

	public Mammal(double weight, double height, int age, String name) {
		super(weight, height, age);
		this.name = name;
	}

	public String getName(){
		return name;
	}

	/** @Override */
	/** public String run(double km){ */
	/**   return "I running away for in mammal class " + km + "km"; */
	/** } */

}

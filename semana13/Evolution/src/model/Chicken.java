package model;

public class Chicken extends Bird implements IMove{

	public Chicken(double weight, double height, int age, double wingSpan) {
		super(weight, height, age, weight);

	}

	@Override
	public String communication() {
		return "The Chicken cackles";
	}

	@Override
	public String jump(double km){
		return "I jumping ... this is funny (?) " + km + "km"; 
	}

	@Override
	public String run(double km){
		return "I running to cross the street" + km + "km"; 
	}

}

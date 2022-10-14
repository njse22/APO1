package model; 

public final class Human extends Mammal{

	public Human(String name) {
		super(name); 
	}

	public Human(){
		super();
	}

	@Override
	public String communication(){
		return "Hi I am a human"; 
	}


	@Override
	public String toString(){
		return "Name of Human: " + super.name;  
	}

}

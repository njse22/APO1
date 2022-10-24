package model; 

public interface IMove{

	public String jump(double km);

	public default String run(double km){
		return "runnig in IMove interface"; 
	}

}

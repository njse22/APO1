import java.util.Scanner; 

public class ReaderConsole{

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in); 
		
		// declaración de la variable name 
		String name; 
		// inicialización de la variable name
		name = "";

		int years = 0; 
		String id = ""; 
		double average = 0.0; 
		boolean isActive = false; 

		System.out.println("Ingrese su nombre: "); 

		// reacignación de la variable name
		name = reader.next();

		System.out.println("ingrese su edad: "); 

		if(reader.hasNextInt()){
			years = reader.nextInt(); 
		}
		else{
			System.out.println("Esto no es un número");
		}


	}
}

import java.util.Scanner; 

public class VectorCalculator{
	
	public static final int VECTOR_SIZE = 5; 
	// declaración de una variable global. 
	static Scanner reader = new Scanner(System.in); 

	public static void main(String[] args){
		int option = 0; 
		while(option != 3){

			option = getOptionShowMenu();
			showOption(option); 

		}
		reader.close();

	} // fin del main.


	public static int[] createVector(int scalar, int init, int stop){
		int[] vector = new int[VECTOR_SIZE]; 
		int j = 0; 
		for(int i = init; j < VECTOR_SIZE; i++){
			if(i%scalar == 0){
				vector[j] = i;
				j++;
			}
		}
		return vector;
	}

	public static String printVector(int[] vector){
		String msj = "[ ";
		for(int i = 0; i < VECTOR_SIZE; i++){
			if(i < VECTOR_SIZE - 1){
				msj += vector[i] + ", ";
			}else{
				msj += vector[i] + " ]";
			}
		}
		return msj;
	}

	public static int dotProduct(int[] vectorA, int[] vectorB){
		int result = 0; 
		for(int i = 0; i < VECTOR_SIZE; i++){
			result += vectorA[i] * vectorB[i];
		}	
		return result; 
	}

	public static String validateOrthogonality(int[] vectorA, int[] vectorB){
		int result = dotProduct(vectorA, vectorB);
		String msj = "";
		if(result == 0){
			msj = "The vectors are orthogonal"; 
		}
		else{
			msj = "The vectors are not orthogonal";
		}
		return msj;
	}

	public static int getOptionShowMenu(){
		int option = 0; 
		System.out.println(
				"1. Create Vector: \n" + 
				"2. Validate Orthogonality: \n" + 
				"3. Exit.");
		option = reader.nextInt(); 

		return option; 
	}

	public static int[] uiCreateVector(){
		System.out.println("type scalar: ");
		int scalar = reader.nextInt();
		System.out.println("type init"); 
		int init = reader.nextInt();
		System.out.println("type end");
		int end = reader.nextInt(); 

		int[] vector = createVector(scalar, init, end); 
		return vector; 
	}

	public static void showOption(int option){
		switch(option){
			case 1: 
				int[] vector = uiCreateVector(); 
				System.out.println(printVector(vector)); 
				break; 

			case 2: 
				int[] vectorA = uiCreateVector(); 
				int[] vectorB = uiCreateVector(); 
				String msj = validateOrthogonality(vectorA, vectorB); 
				System.out.println(msj); 

				break; 

			case 3: 
				System.out.println("Bye !!");
				break; 

			default: 
				System.out.println("invalid option");
				break; 
		}
	}

}

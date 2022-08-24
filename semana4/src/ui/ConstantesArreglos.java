import java.util.Scanner; 

public class ConstantesArreglos{

	public static final int SIZE_OF_NOTES = 3;

	public static final int SIZE_OF_ARRAY = 10; 
/**
*   ^      ^      ^------------|
*   |			 |_______						 |
* operador        |            |--- la variable no puede cambiar de valor
* visivilidad    contexto 
*								 siempre es 
*								 static 
*/
	public static void main(String[] args){

		// Declaración de un arreglo de enteros de tamaño 10.
		int[] array = new int[10];
/**
*   ^       ^           ^
*   |       |-------|   |----------------¬
* Tipo de dato      |                    |
*                 Nombre del arreglo     |
*                                      Declaración del arreglo con tamaño 10.  
*
*/

		// asignación a la pos 0 del arreglo 
		array[0] = 1; 

		// Inicialización del arreglo "letters" 
		String[] letters = {"a", "b", "c"};

		System.out.println(array[1]);

		// inicialización del arreglo de enteros con un for.
		for(int i = 0 ; i < SIZE_OF_ARRAY; i++){
			array[i] = i; 
			System.out.println("array en la pos: " + i + " es: " + array[i]); 
		}
		System.out.println("Array en la pos: " + (SIZE_OF_ARRAY-1));
		System.out.println(array[SIZE_OF_ARRAY - 1]);

		double[] notes = {2.5, 4.0, 5.0}; 
		double[] weidths = {0.3, 0.5, 0.2}; 

		double result = calculateDef(notes, weidths);  
		System.out.println("la definitiva es: " + result);

	}

	/*
	* calculateDef: Calculates 
	*/
	public static double calculateDef(double[] notes, double[] weidths){
		double result = 0.0; 

		for(int i = 0; i < SIZE_OF_NOTES; i++){
			result += notes[i] * weidths[i];
		}
		return result;
	}

}

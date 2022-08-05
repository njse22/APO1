// importanción de las librerías de java
import java.util.Scanner;

// el nuombre de la clase debe ser igual a el nombre del archivo
public class Variables{

	public static void main(String[] args){

		// Entra de información 
		Scanner scanner = new Scanner(System.in);

		// declaración de la variable 
		int number1; 
		
		// inicializar la variable
		number1 = 5;

		System.out.println(number1);

		int numero2; 
		System.out.println("Ingrese un número: ");

		// entrada de un valor númerico 
		numero2 = scanner.nextInt();
		System.out.println("El valor ingresado es: " + numero2);

		System.out.println("Ingrese el segundo número: ");
		int numero3 = scanner.nextInt();

		int suma = numero2 + numero3; 
		System.out.println("El resultado de la suma es: " + suma);

		System.out.println("La resultado de la resta es: " + (numero2 - numero3));

		System.out.println("El resultado de la división es: " + (numero2 / numero3));

		System.out.println("El resultado de la multiplicación es: " + (numero2 * numero3));

		System.out.println("El resultado del el modulo es: " + (numero2 % numero3));

	}

}

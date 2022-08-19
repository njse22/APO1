import java.util.Scanner; 
import java.lang.Math;

public class StudentCalculator{

	public static void main(String[] args){ // inicio del método main
			
		Scanner reader = new Scanner(System.in);

		int option = 0; 

		do{ // inicio del ciclo
			System.out.println("seleccione una opción: \n" +
					"option 1 \n"+
					"option 2 \n"+ 
					"option 3: calculate attenuation.");
			// leer la opción ingresada por el usuario. 
			option = reader.nextInt(); 

			// estructura de control 
			switch(option){
				case 1:
					System.out.println("este es la option 1"); 
				break;

				case 2: 
					System.out.println("This is the option 2"); 
					break; 

				case 3: 
					System.out.println("Calculate Attenuation: "); 
					System.out.println("Ingrese la distancia entre los dos puntos");
					double distance = reader.nextDouble();
					System.out.println("Ingrese la longitud de onda de la señal: "); 
					double lambda = reader.nextDouble(); 
					double lbf = calculateAtenuation(distance, lambda); 
					System.out.println("el resultado de la atenuación es: " + lbf + "dB"); 
					break;
			  // finaliza el ciclo while
				case 0:
					System.out.println("Bye !!!");
					break;

				default:
					System.out.println("Invalid option.");
			}
		}while(option != 0); // fin del ciclo

	} // fin del método main 

	/*
	 *
	 * */
	public static double calculateAtenuation(double distance, double lambda){
		double lbf = 0.0; 
		lbf = (Math.log10(4*Math.PI*distance))/lambda;
		return lbf; 
	}




}

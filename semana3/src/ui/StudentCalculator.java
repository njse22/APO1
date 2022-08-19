import java.util.Scanner; 

public class StudentCalculator{

	public static void main(String[] args){
			
		Scanner reader = new Scanner(System.in);

		int option = 0; 

		do{
			System.out.println("seleccione un menu: \n" +
					"option 1 \n"+
					"option 2 \n");
			option = reader.nextInt(); 
			switch(option){
				case 1:
					System.out.println("este es la option 1"); 
				break;

				case 2: 
					System.out.println("This is the option 2"); 
					break; 

				case 0:
					System.out.println("Bye !!!");
					break;

				default:
					System.out.println("Invalid option.");
			}
		}while(option != 0);

	}


}

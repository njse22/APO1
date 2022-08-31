import java.util.Scanner;

public class Store{

	public static final int TOTAL_PRODUCTS = 10; 

	// declaración de de las variables.
	static Scanner reader; 
	static String[] names;
	static double[] prices;
	static int[] units; 

	public static void main(String[] args) {

		// inicialización de las variables. 
		init(); 
		int option = 0; 

		do{

			option = getOptionShowMenu(); 
			executeOption(option);

		}while(option != 0);

		reader.close();
		
	}

	public static void init(){
		// inicialización de las variables.
		reader = new Scanner(System.in); 
		names = new String[TOTAL_PRODUCTS]; 
		prices = new double[TOTAL_PRODUCTS];
		units = new int[TOTAL_PRODUCTS];
	}

	public static String getProductMax(){
		String msj = ""; 
		double maxPrice = prices[0]; 
		int pos = 0;
		for(int i = 0; i < TOTAL_PRODUCTS; i++){
			if(prices[i] > maxPrice){
				maxPrice = prices[i];
				pos = i; 	
			}
		}
		msj = "Prodct name: " + names[pos] + " price: " + prices[pos] +
			" units: " + units[pos]; 
		return msj; 

	}

	
	public static int getOptionShowMenu(){
		int option = 0; 
		System.out.println("<<<<< Welcome to Store >>>>>");
		System.out.println(
				"1. Add Product \n" +
				"2. Search Product by name \n" + 
				"3. Show product with max value \n" +
				"4. Show product with min value \n" + 
				"5. List all products \n" +
				"0. Exit. ");
		option = reader.nextInt(); 

		return option; 
	}

	public static void executeOption(int option){
		String name = ""; 
		double price = 0.0; 
		int unit = 0; 

		switch(option){
			case 1: 
				

				break; 

			case 2: 
				
				break; 

			case 3: 
				
				break; 

			case 4: 
				

				break; 

			case 5: 
				
				break; 

			case 0: 
				System.out.println("Exit program.");
				break; 

			default: 
				System.out.println("Invalid Option");
				break; 
		}
	}
    
}

package ui; 

import model.*;

public class Main{

	public static final int ROWS = 10; 
	public static final int COLUMNS = 10; 
	public static void main(String[] args) {
		int[][] matrix = new int[ROWS][COLUMNS];

		matrix[0][0] = 1;
		matrix[5][5] = 1;

		System.out.println(matrix[0][0]);
		System.out.println(matrix[5][5]);
		System.out.println(matrix[4][4]);


		Person[][] persons = new Person[ROWS][COLUMNS]; 

		persons[0][0] = new Person("nombre", 20); 
		System.out.println(persons[0][0].getName());
		System.out.println(persons[0][1]);

		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[0].length; j++) {
				persons[i][j] = new Person("nombre_"+i+"apellido_"+j, i+j);
				if(persons[i][j].getName().equals("nombre_5apellido_5")){
					System.out.println(persons[i][j].getName());

				}

			}
			
		}

	}
}

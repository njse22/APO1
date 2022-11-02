package ui; 

import model.*;

import java.util.Random; 
import java.util.Date; 
import java.util.Calendar; 

public class Main{

	public static final int ROWS = 10; 
	public static final int COLUMNS = 10; 
	
	private PersonController controller; 

	public Main(){
		controller = new PersonController(); 
	}

	public PersonController getController(){
		return controller; 
	}
	
	public static void main(String[] args) {
		Main main = new Main(); 
		main.factoryPersonsInMatrix();

	}

	public void factoryPersonsInMatrix(){
		Person student1 = new Student("nameStudent1", 17, 3.0); 
		Person student2 = new Student("nameStudent2", 17, 4.0); 
		Person student3 = new Student("nameStudent3", 17, 3.5); 
		Person student4 = new Student("nameStudent4", 17, 4.7); 

		Person teacher = new Teacher("nameTeacher", 30); 
		

		System.out.println(controller.addPerson(student1));
		controller.addPerson(student2);
		controller.addPerson(student3);
		controller.addPerson(student4);

		System.out.println(controller.addPerson(teacher)); 
		System.out.println(controller.printStudents()); 
		System.out.println(controller.compareteStudent()); 
		System.out.println(controller.printMatrix());
		System.out.println(controller.printDoubleMatrix()); 

	}


	/** 
	public void exampleMatrix(){
		int[][] matrix = new int[ROWS][COLUMNS];

		matrix[0][0] = 1;
		matrix[5][5] = 1;

		System.out.println(matrix[0][0]);
		System.out.println(matrix[5][5]);
		System.out.println(matrix[4][4]);


		//Person[][] persons = new Person[ROWS][COLUMNS]; 

		//persons[0][0] = new Person("nombre", 20); 
		//System.out.println(persons[0][0].getName());
		//System.out.println(persons[0][1]);
 
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[0].length; j++) {
				persons[i][j] = new Person("nombre_"+i+"apellido_"+j, i+j);
				if(persons[i][j].getName().equals("nombre_5apellido_5")){
					System.out.println(persons[i][j].getName());

				}

			}
			
		}
	}
	*/

}

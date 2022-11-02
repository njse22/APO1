package model; 
import java.util.ArrayList; 
import java.util.Random; 
import java.lang.Math;

public class PersonController{

    public static final int ROWS = 5; 
    public static final int COLUMNS = 5; 

    private int[][] notes;
    private Random random;

    // declaración de una variable/atributo 
    private ArrayList<Person> persons; 
    //                 ^ 
    //                 |
    //              El tipo de dato 
    //              que almacena el ArrayList


    private Person[][] matrixPersons;

    public PersonController(){
        random =  new Random();
        // inicializar el arreglo 
        persons = new ArrayList<Person>(5); 
        //                              ^
        //                              |
        //                      Se define una capacidad 
        //                      inicial para el arreglo 
        //      

        matrixPersons = new Person[ROWS][COLUMNS]; 
        notes = new int[ROWS][COLUMNS]; 

    }


    public boolean addPerson(Person person){
        return persons.add(person); 
    }


    public String printStudents(){
        String msj = ""; 
        for(int i = 0; i < persons.size(); i++ ){
            if(persons.get(i) instanceof Student){
                msj += ((Student)(persons.get(i))).toString() + "\n"; 
            }
        }
        return msj; 
    }


    public String compareteStudent(){
        String msj = ""; 
        for(int i = 0; i < persons.size(); i++){
            if( (persons.get(i) instanceof Student) && (persons.get(i+1) instanceof Student) ){
               msj += ((Student)(persons.get(i))).compareTo( (Student)(persons.get(i+1)) ) + "\n"; 
            }
        }

        return msj; 

    }

    public String printMatrix(){
        String msj = ""; 

        for(int i = 0; i < ROWS; i++){
            msj += "\n"; 
            for(int j = 0; j < COLUMNS; j++){
                msj += matrixPersons[i][j] + " ";
            }
        }
        return msj; 
    }

    public String printDoubleMatrix(){
        String msj = ""; 
        int upperBound = 5;
        int lowerBound = 0;
        int range = (upperBound - lowerBound) + 1;

        for(int i = 0; i < ROWS; i++){
            msj += "\n"; 
            for(int j = 0; j < COLUMNS; j++){
                notes[i][j] = (int)(Math.random() * range) + lowerBound;
                msj += notes[i][j] + " ";  
            }
        }
        return msj; 
    }


    
    

}
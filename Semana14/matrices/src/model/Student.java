package model; 

public class Student extends Person implements Comparable<Student>{

    private double average; 

    public Student(String name, int age, double average){
        super(name, age); 
        this.average = average;  

    }

    public double getAverage(){
        return this.average; 
    }


    @Override
    public String toString(){
        return super.getName() + " | " + super.getBirthdate();
    }

    @Override
    public int compareTo(Student student){
        // retorna 0 si los dos objetos son iguales|
        int result = 0; 

        // si el la instancia que llama a este método
        // es mas grande que el objeto/instalcia 
        // que llega por párametro 
        if(this.average > ((Student)(student)).getAverage()){
            result = 1; 
        }
        // si el la instancia que llama a este método
        // es mas pequeña que el objeto/instalcia 
        // que llega por párametro 
        else if(this.average < ((Student)(student)).getAverage()){
            result = -1; 
        }

        return result; 
    }
}
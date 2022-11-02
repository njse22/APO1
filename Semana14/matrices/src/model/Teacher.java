package model; 

public class Teacher extends Person implements Comparable<Teacher>{

    public Teacher(String name, int age){
        super(name, age); 

    }

    @Override
    public int compareTo(Teacher teacher){
        // retorna 0 si los dos objetos son iguales|
        int result = 0; 

        // si el la instancia que llama a este método
        // es mas grande que el objeto/instalcia 
        // que llega por párametro 
        if(super.getAge() > ((Teacher)(teacher)).getAge()){
            result = 1; 
        }
        // si el la instancia que llama a este método
        // es mas pequeña que el objeto/instalcia 
        // que llega por párametro 
        else if(super.getAge() < ((Teacher)(teacher)).getAge()){
            result = -1; 
        }

        return result; 
    }

    
}
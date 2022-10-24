package ui;

import model.Animal;
import model.Bird;
import model.Chicken;
import model.Duck;
import model.Felidae;
import model.Human;
import model.Mammal;
import model.Species;
import model.IMove; 
import model.IFly; 

import java.util.Scanner;

public class Main {
    private Scanner sc;

    public Main() {
        this.sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.initAnimals();
        /** Animal humanA = new Human(60, 1.67, 30, "Camilo"); */
        /** System.out.println(humanA.toString());  */
        /** System.out.println(humanA.communication());  */
        /**  */
        /** Mammal humanB = new Human(60, 1.67, 30, "Juan"); */
        /** System.out.println(humanB.toString());  */
        /** System.out.println(humanB.communication());  */
        /**  */
        /** Human humanC = new Human(60, 1.67, 30, "Jorge"); */
        /** System.out.println(humanC.toString());  */
        /** System.out.println(humanC.communication());  */

        /** main.factoryAnimal(); */
        /** main.factoryIMove(); */
        main.factoryHumans();


    }

    /**
     * crea objetos de tipo Animal
     *
     **/
    public void factoryAnimal() {

        Animal human = new Human(60, 1.65, 30, "Nicolas");
        System.out.println(human.communication());
        Animal cat = new Felidae(15, 30, 3, "Garfield", Species.CAT);
        System.out.println(cat.communication());
        Animal duck = new Duck(6, 30, 4, 60);
        System.out.println(duck.communication());

        Human a = new Human(60, 1.75, 30, "hhh");

        System.out.println(printToString(a));
        System.out.println(printToString(cat));
        System.out.println(printToString(duck));
    }


    public void initAnimals() {
        Animal humanA = new Human(60, 1.67, 30, "Camilo");
        Mammal humanB = new Human(60, 1.67, 30, "Juan");
        Human humanC = new Human(60, 1.67, 30, "Jorge");
        Felidae felindaeA = new Felidae(20, 20, 5, "Garfield", Species.CAT);
        Bird birdA = new Chicken(10, 25, 5, 20);
        Chicken chicken = new Chicken(10, 27, 6, 21.2);
        Duck duck = new Duck(10, 23, 4, 22.5 );

    }


    public void factoryIMove(){
        IMove human = new Human(60, 1.67, 30, "Camilo"); 
        System.out.println(human.run(4.5));

        IMove chicken = new Chicken(10, 25, 5, 20); 
        System.out.println(chicken.run(4.5));
        IMove felindae = new Felidae(20, 20, 5, "Garfield", Species.CAT);
        System.out.println(felindae.run(4.5));
    }

    public void factoryHumans(){
        System.out.println("Imove human");
        IMove iMovehuman = new Human(60, 1.67, 30, "Camilo"); 
        System.out.println(iMovehuman.run(4.5));

        System.out.println("Animal human");
        Animal animalHuman = new Human(60, 1.67, 30, "Camilo");
        System.out.println(animalHuman.communication());

        System.out.println("Human perse");
        Human human = new Human(60, 1.67, 30, "Camilo"); 
        System.out.println(human.run(4.5));
        System.out.println(human.communication());

        System.out.println("Mammal human");
        Mammal mammalHuman = new Human(60, 1.67, 30, "Camilo"); 
        System.out.println(mammalHuman.run(4.5));
        System.out.println(mammalHuman.communication());


    }

    public String printToString(Animal animal){
        return animal.toString();
    }

}

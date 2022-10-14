package ui; 

import model.*; 


public class Main{

	public static void main(String[] args) {
		Human a = new Human("Jimmy"); 
		System.out.println(a.getName());
		System.out.println(a.communication());
		System.out.println(a.toString());
		
		Human b = new Human(); 
		System.out.println(b.getName());

	}

}

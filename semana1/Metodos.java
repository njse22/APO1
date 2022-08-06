import java.util.Scanner; 

public class Metodos {
	
	public static void main(String[] args){
		int a = 5; 
		int b = 7; 
		int c = add(a, b);
		System.out.println(c);
		System.out.println( getMax(a, b) );

	public static int add(int a, int b){
		int c = a + b; 
		return c; 
	}

	public static int getMax(int a, int  b){
		int c; 
		if(a > b){
			c = a; 

		}
		else {
			c = b;
		}
		return c;
	}







}

package oop;
import java.util.Scanner;
public class RelationalOperators {
	public static void main(String[] args) {
		   int a,b;
		      Scanner sc= new Scanner(System.in);
		      System.out.println("Type a number:");
		      a = sc.nextInt(); 
		      System.out.println("Type another number:");
		      b = sc.nextInt();
		      System.out.println("a is " + a + " and b is " + b);
		      
		      System.out.println(a == b);  

		      System.out.println(a != b);  

		      System.out.println(a > b);  

		      System.out.println(a < b);

		      System.out.println(a >= b);  

		      // <= operator
		      System.out.println(a <= b); 

}
}
package oop;
import java.util.Scanner;
public class Bitwise {
	public static void main(String[] args) {
		   int a,b,c;
		      Scanner sc= new Scanner(System.in);
		      System.out.println("Type a number:");
		      a = sc.nextInt(); 
		      System.out.println("Type another number:");
		      b = sc.nextInt();
		      System.out.println("Type another number:");
		      c = sc.nextInt();
		      c = a & b;       
		      System.out.println("a & b = " + c );

		      c = a | b;  
		      System.out.println("a | b = " + c );
		      c = a ^ b;        
		      System.out.println("a ^ b = " + c );

		      c = ~a;           
		      System.out.println("~a = " + c );
		      c = a ^ b;        
		      System.out.println("a ^ b = " + c );

		      c = ~a;           
		      System.out.println("~a = " + c );
		      c = a << 2;      
		      System.out.println("a << 2 = " + c );

		      c = a >> 2;      
		      System.out.println("a >> 2  = " + c );

		      c = a >>> 2;      
		      System.out.println("a >>> 2 = " + c );

	}
}
package oop;

import java.util.Scanner;
class Incdecoperators {
    public static void main(String[] args) {
   
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Type a number:");
        a = sc.nextInt(); 
        System.out.println("Type another number:");
        b = sc.nextInt();
      int result1, result2;

      System.out.println("Value of a: " + a);

      result1 = ++a;
      System.out.println("After increment: " + result1);

      System.out.println("Value of b: " + b);

      result2 = --b;
      System.out.println("After decrement: " + result2);
    }
  }
package oop;
import java.util.Scanner;
class Ternary_operators {
    public static void main(String[] args) {

      int februaryDays;
      Scanner sc= new Scanner(System.in);
      System.out.println("Type a number:");
      februaryDays = sc.nextInt(); 
      String result;
      // ternary operator
      result = (februaryDays== 28) ? "Not a leap year" : "Leap year";
      System.out.println(result);
    }
  }
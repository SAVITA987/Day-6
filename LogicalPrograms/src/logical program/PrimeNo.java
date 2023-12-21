package logic;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Enter a number: ");
     int number = scanner.nextInt();

     if (isPrimeNumber(number)) {
         System.out.println(number + " is a Prime Number.");
     } else {
         System.out.println(number + " is not a Prime Number.");
     }

     scanner.close();
 }

 static boolean isPrimeNumber(int num) {
   
     if (num <= 1) {
         return false;
     }

     for (int i = 2; i <= Math.sqrt(num); i++) {
         if (num % i == 0) {
             return false; 
         }
     }

     return true;
 }
}

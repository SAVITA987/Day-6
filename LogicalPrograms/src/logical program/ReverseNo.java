package logic;

import java.util.Scanner;
public class ReverseNo {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int reversedNumber = reverseNumber(number);
	        System.out.println("Reversed Number: " + reversedNumber);
	    }

	    static int reverseNumber(int num) {
	        int reversedNumber = 0;

	        while (num != 0) {
	            int remainder = num % 10;
	            reversedNumber = reversedNumber * 10 + remainder;
	            num /= 10;
	        }

	        return reversedNumber;
	    }
	}


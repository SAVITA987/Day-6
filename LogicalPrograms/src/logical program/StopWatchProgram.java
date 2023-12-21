package logic;
import java.util.Scanner;

class StopWatchProgram {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Stopwatch Program");
	        System.out.println("1. Start Stopwatch");
	        System.out.println("2. Stop Stopwatch");
	        System.out.println("3. Exit");

	        int choice;
	        long startTime = 0;
	        long endTime = 0;

	        do {
	            System.out.print("Enter your choice (1/2/3): ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    startTime = System.currentTimeMillis();
	                    System.out.println("Stopwatch started.");
	                    break;
	                case 2:
	                    if (startTime == 0) {
	                        System.out.println("Stopwatch not started. Please start the stopwatch first.");
	                    } else {
	                        endTime = System.currentTimeMillis();
	                        long elapsedTime = endTime - startTime;
	                        System.out.println("Stopwatch stopped.");
	                        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Exiting Stopwatch Program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
	            }
	        } while (choice != 3);

	    }
	}


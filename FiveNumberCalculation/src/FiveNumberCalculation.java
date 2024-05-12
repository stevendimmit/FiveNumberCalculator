import java.util.Scanner;

public class FiveNumberCalculation {
	
	
	public static void main(String[] args) {
		//initiate variables and set up scanner
		Scanner scnr = new Scanner(System.in);
		double total = 0;
		double average = 0;
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		int i = 0;
		
		System.out.println("5 Number Stat Generator");
		
		//Using a while loop to iterate through the 5 numbers, 
		//using try catch to catch improper input and prevent the app from crashing
		while (i < 5) {
			try {
				System.out.print("Enter a number: ");
				double userNum = scnr.nextDouble();
				total = total + userNum;
				if (userNum > max) {
					max = userNum;
				}
				if (userNum < min) {
					min = userNum;
				}
				i++;
				
				
			} catch (Exception e){ 
				System.out.println("Not valid.");
				scnr.next();
			}
		}
		average = total / 5.0;
		
		//Print out our calculations 
		
		System.out.println("The sum of your five numbers: " + total);
		System.out.println("The average:" + average);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Interest on total at 20%: " + (total * 0.2));
	}
}
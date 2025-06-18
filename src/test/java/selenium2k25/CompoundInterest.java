package selenium2k25;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle amount");
		double p = sc.nextDouble();
		System.out.println("Enter rate of interest amount");
		double r = sc.nextDouble();
		System.out.println("Enter time period amount");
		double t = sc.nextDouble();
		
		double TotalAmount = p * Math.pow((1 + r/100), t);
		
		System.out.println("Total amount is " + TotalAmount);
		
		double CompoundInterest = TotalAmount - p ;
		
		System.out.println("Compound Interest is " + CompoundInterest);
		
	}

}


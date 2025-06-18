package selenium2k25;

import java.util.Scanner;

public class factorialrepeat {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numnber");
		
	      int input = sc.nextInt();
		
		System.out.println("factorial is " + factorial(input));
		
		//recursion
	}
	
	public static int factorial(int n) {
		if (n == 0 || n ==1) return 1;
		return n * factorial(n-1); 
	}
	
	
	
	
	

}

package selenium2k25;

import java.util.Scanner;

public class FactorialByRecursion {
		//create method for factorial recursion
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter factorial number");
		int input = sc.nextInt();
		System.out.println("factorial number is " + input);
		int result = 1;
		
	System.out.println("factorial number is " + result);
		
	System.out.println("factorial of " + input + " is " + factorial(input));
		
	}
		
	public static int factorial(int n) {
			
	if (n == 0 || n == 1) return 1;
      return n * factorial(n - 1);
				
		}
}


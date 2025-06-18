package selenium2k25;

import java.util.Scanner;

public class SumandAvg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, sum;
		float avg;
		
		System.out.println("Enter a ");
		a = sc.nextInt();
		System.out.println("Enter b ");
		b = sc.nextInt();
		
		 sum = a + b;
		
		System.out.println("sum of a & b is " + sum);
		
		 avg = (float) ((a+b)/2);
		 
		 System.out.println("avg of a & b is " + avg);
	}

}

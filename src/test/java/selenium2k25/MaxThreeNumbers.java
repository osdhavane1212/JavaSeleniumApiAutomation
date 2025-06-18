package selenium2k25;

import java.util.Scanner;

public class MaxThreeNumbers {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ");
		a = sc.nextInt();
		System.out.println("Enter b ");
		b = sc.nextInt();
		System.out.println("Enter c ");
		c = sc.nextInt();
		
		if( a > b &&  a > c) {
			System.out.println("a is max number");	
			
		}else if (b > c && b> a) {
			System.out.println("b is max number");	
			
		}else
		{System.out.println("c is max number");
		}
	}

}

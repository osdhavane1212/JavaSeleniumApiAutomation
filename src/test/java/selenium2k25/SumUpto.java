package selenium2k25;

import java.util.Scanner;

public class SumUpto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sum upto n");
		int n = sc.nextInt();
		int totalsum = 0;
		
		for(int i = 1; i <=n; i++) {
			totalsum = totalsum + i;	
		}
		System.out.println("Total Sum is " + totalsum );
		
	}

}

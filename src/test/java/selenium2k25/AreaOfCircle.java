package selenium2k25;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		int radius;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius");
		
		radius = sc.nextInt();
		
		double areaofcircle = (Math.PI * radius * radius);
		
		System.out.println("Area of Circle is " + areaofcircle);
			
		}
		

	}


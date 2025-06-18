package selenium2k25;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter leap year");
		int leapyear = sc.nextInt();
		
		//leap year formula is basically must be divide by 4 and should not by 100 or should by 400
		
		if((leapyear % 4 == 0 && leapyear %100 !=0) ||  (leapyear % 400 == 0)){
			System.out.println(leapyear + " is a leap year");
		}else {
				System.out.println(leapyear + " is not a leap year");}
		
			
		}
	}


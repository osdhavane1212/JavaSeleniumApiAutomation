package selenium2k25;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
	int num1 = 100;
	
	int num2 = 50;
	
	 System.out.println("num1 is " + num1 + " and " + "num2 is " + num2);
	
	 num1 = num1 + num2;
	//num1 = 150
	 num2 = num1 - num2;
	 //num2 = 100;
	 
	 num1 = num1 - num2;
	 System.out.println("num1 is " + num1 + " and " + "num2 is " + num2);

	}

}

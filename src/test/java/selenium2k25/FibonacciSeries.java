package selenium2k25;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//fiboannci is basically addition of current number and previous number, it start fro, 0, 1
		int n = 10; // we have to print till 10 
		
		int first = 0, second = 1;
		
		System.out.print("Fibonacci Series: " + first + ", " + second);
		
		for(int i =2; i<n; i++) {
			
			int next = first + second;
			System.out.print(",  " + next);
			
			first = second;
			second = next;
			
		}
		
	}

}

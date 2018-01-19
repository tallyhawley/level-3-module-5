package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		
		System.out.println(recursiveFibo(47));
	}
	
	static int recursiveFibo(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return recursiveFibo(n-1) + recursiveFibo(n-2);
		}
	}
}

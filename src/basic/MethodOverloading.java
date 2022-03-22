package basic;

public class MethodOverloading {
	// Achieving method overloading with different no of arguments
	int sum (int a , int b) {
		return a+b;
	}
	int sum (int a , int b, int c) {
		return a+b+c;
	}
	
	// Achieving method overloading with different no arguments type
	int sum ( double a , double b) {
		return (int) (a-b);
	}
	public static void main(String[] args) {
		MethodOverloading MethObj = new MethodOverloading();
		System.out.println("Sum methods with 2 arguments " + MethObj.sum(2,3));
		System.out.println("Sum methods with 3 arguments " + MethObj.sum(2,3,4));
		System.out.println("Sum methods with 2 arguments " + MethObj.sum(12.9, 11.9));
	}
}

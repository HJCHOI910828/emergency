package test2;

public class JavaTest08 {
	public static void main(String[] args) {
		
		int rs1 = factorial(3);
		int rs2 = factorial(4);
		int rs3 = factorial(5);

		System.out.println("3! = "+rs1);
		System.out.println("4! = "+rs2);
		System.out.println("5! = "+rs3);		
	}
	
	public static int factorial(int n) {

		if (n <= 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}

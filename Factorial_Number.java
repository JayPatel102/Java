import java.util.Scanner;

class Factorial_Number {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		System.out.print("Enter Number to find it's Factorial Value: ");
		int n=read.nextInt();

		int mul=1;

		for (int i=1; i<=n; i++) {
			
			mul=mul*i;
		}

		System.out.print("\n\nFactorial Value of "+n+" : "+mul);
	}
}
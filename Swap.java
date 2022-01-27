import java.util.Scanner;

class Swap
{
	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		System.out.print("Enter No 1: ");
		int n1=read.nextInt();

		System.out.print("Enter No 2: ");
		int n2=read.nextInt();

		System.out.print("\n\n_____________________________________");

		int tmp=n1;
		n1=n2;
		n2=tmp;

		System.out.print("\n\nNo 1: "+n1);
		System.out.print("\nNo 2: "+n2);
	}
}
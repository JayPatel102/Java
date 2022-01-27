import java.util.Scanner;

class Switch
{
	public static void main(String[] args) {
		
		int choice=0,n;
		Scanner read=new Scanner(System.in);

		System.out.print("Enter Number: ");
		n=read.nextInt();

		do {



			System.out.println("1.Square");
			System.out.println("2.Cube");
			System.out.println("0.Exit\n\n");

			System.out.print("Enter your choice: ");
			choice=read.nextInt();

			switch(choice) {

			case 1:System.out.println("\n\nSquare: "+n*n);
				break;

			case 2:System.out.println("\n\nCube: "+n*n*n);
			break;

			default:System.exit(0);
			break;
			}
		}while(choice!=0);
	}
}
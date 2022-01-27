import java.util.Scanner;

class Armstrong {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		System.out.print("Enter number to check whether it is Armstrong or not: ");
		int n=read.nextInt();

		int tmp=n,r,sum=0;

		while (n>0){

			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}

		if (tmp==sum) 
			System.out.print("\n\n"+tmp+" is Armstrong Number");
		else
			System.out.print("\n\n"+tmp+" is not Armstrong Number");
	}
}
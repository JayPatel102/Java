import java.util.Scanner;

class Swap2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int n=s.nextInt();
		
		int backup=n;
		int lastDigit=n%10;
		
		while(n>10)
		{
			n=n/10;
		}
		
		int firstDigit=n;
		n=backup/10;

		int c,r=0;

		while(n>10)
		{
			c=n%10;
			r=r*10+c;
			n=n/10;
		}

		int swap=lastDigit;
		int d;

		while(r>0)
		{
			d=r%10;
			swap=swap*10+d;
			r=r/10;
		}

		swap=swap*10+firstDigit;

		System.out.println("After swap:"+swap);
	}
}
import java.util.Scanner;

class Count_Number {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		System.out.print("Enter Number:");
		int n=read.nextInt();

		//long backup=n;
		int count=0;

		do {
			n/=10;
			count++;
		}while(n!=0);

		int cnt[]=new int[count];
		
		while(n>0) {

			int re=n%10;
			cnt[re]++;
			n=n/10;
		}

		int r=0;

		for(int i=0;i<count;i++) {

			if (cnt[i]>1) {
				
				r++;
			}
		}
		System.out.print(r);
	}
}
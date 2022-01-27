import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int i,n,sum=0;
		System.out.print("Enter the No. : ");
		
		n = sc.nextInt();
		System.out.println("==================");
		for(i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("Sum is : " + sum);
	}
}

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no you want to                 multiplication table of : ");
		
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.println(n+"  *  "+i+"  =  "+n*i);
			}
	}
}
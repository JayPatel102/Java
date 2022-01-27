import java.util.Scanner;  

class Perfect_Number  
	{  
		public static void main(String args[])    
		{    
			Scanner read=new Scanner(System.in);         
			
			System.out.print("Enter the number: ");  
			int n=read.nextInt();  
			
			int i=1,sum=0;  
  
			while(i<=n/2)  
			{  
				if(n%i==0)   
  					sum=sum+i;   
				i++;  
			} 
  
			if(sum==n)  
  				System.out.println(n+" is a perfect number.");  
			else  
				System.out.println(n+" is not a perfect number.");   
		}  
}  
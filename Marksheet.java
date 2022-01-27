import java.util.Scanner;

public class Marksheet
{
    public static void main(String args[]) {
    	
        int marks[] = new int[7];
        int i;
        float total=0, avg;
        String Sname;
        Scanner read = new Scanner(System.in);
		
        System.out.print("Enter Name of Student: ");
        Sname=read.nextLine();
        
        for(i=0; i<7; i++) { 
           System.out.print("Enter Marks of Subject "+(i+1)+":");
           marks[i] = read.nextInt();
           total = total + marks[i];
        }
        
        avg = total/6;
        System.out.println(Sname+"'s Average mark is: "+avg);
        System.out.print(Sname+"'s Grade is: ");
       
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
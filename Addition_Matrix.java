import java.util.Scanner;

class Addition_Matrix {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		System.out.print("Enter Row of array: ");
		int row=read.nextInt();

		System.out.print("Enter Column of array: ");
		int column=read.nextInt();

		int[][] arr1=new int[row][column];
		int[][] arr2=new int[row][column];

		for (int i=0; i<row; i++) {
		 	
		 	for (int j=0; j<column; j++) {
		 		
		 		System.out.print("Enter Value in array["+i+"]["+j+"]: ");
		 		arr1[i][j]=read.nextInt();
		 	}
		 } 

		 System.out.print("\n\nEnter Value in Array 2:\n\n");

		for (int i=0; i<row; i++) {
		 	
		 	for (int j=0; j<column; j++) {
		 		
		 		System.out.print("Enter Value in array["+i+"]["+j+"]: ");
		 		arr2[i][j]=read.nextInt();
		 	}
		 } 

		 for (int i=0; i<row; i++) {
		 	
		 	for (int j=0; j<column; j++) {
		 		
		 		System.out.print((arr1[i][j]+arr2[i][j])+" ");
		 	}
		 	System.out.print("\n");
		 } 
	}

}
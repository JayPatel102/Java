import java.util.Scanner;

class TwoD_Array {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		System.out.print("Enter Row of array: ");
		int row=read.nextInt();

		System.out.print("Enter Column of array: ");
		int column=read.nextInt();

		int[][] arr=new int[row][column];

		for (int i=0; i<row; i++) {
		 	
		 	for (int j=0; j<column; j++) {
		 		
		 		System.out.print("Enter Value in array["+i+"]["+j+"]: ");
		 		arr[i][j]=read.nextInt();
		 	}
		 } 

		 for (int i=0; i<row; i++) {
		 	
		 	for (int j=0; j<column; j++) {
		 		
		 		System.out.print(arr[i][j]+" ");
		 	}
		 	System.out.print("\n");
		 } 
	}

}
import java.util.Scanner;

class JaggedArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter size of row: ");
		int row=sc.nextInt();

		int[][] arr=new int[row][];

		for (int i=0; i<row; i++) {
			
			System.out.print("Enter Value of index "+i+" for Column: ");
			int temp=sc.nextInt();
			arr[i]=new int[temp];
		}
		
		for (int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr[i].length; j++) {
				
				System.out.print("Enter Element in array["+i+"]["+j+"]: ");
				arr[i][j]=sc.nextInt();
			}
		}

		for (int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
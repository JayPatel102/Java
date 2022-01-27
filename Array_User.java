import java.util.Scanner;

class Array_User {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int size=read.nextInt();

		int[] arr=new int[size];

		for (int i=0; i<arr.length; i++) {
			
			System.out.print("Enter Elements in arr["+(i+1)+"]: ");
			arr[i]=read.nextInt();
		}

		System.out.print("\n________________________________________________________\n");

		for (int i=0; i<arr.length; i++) {
			
			System.out.print("array["+(i+1)+"]: "+arr[i]+"\n");
		}
	}
}
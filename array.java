import java.util.Scanner;

class array {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		int[] arr=new int[10];

		for (int i=0; i<10; i++) {
			
			System.out.print("Enter Elements in arr["+i+"]: ");
			arr[i]=read.nextInt();
		}

		System.out.print("\n________________________________________________________\n");

		for (int i=0; i<10; i++) {
			
			System.out.print("array["+i+"]: "+arr[i]+"\n");
		}
	}
}
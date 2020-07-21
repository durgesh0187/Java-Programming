import java.util.Scanner;
public class matrixRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the dimension of matrix");
		
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int arr[][]=new int [row][col];
		System.out.println("enter the element of matrix");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("results");
			for(int j=col;j>0;j--) {
				for(int i=row;i>0;i--) {
					System.out.print(arr[j][i]+" ");
				}
				System.out.println();
			}
		
		
	}

}

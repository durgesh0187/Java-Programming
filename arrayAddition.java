import java.util.Scanner;

public class arrayAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int arr[]= {1,3,4,5,6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				
			
			System.out.print(arr[j]+" ");
			}
		}
	}

}

package sorting;
import java.util.Scanner;
public class bubbleShort {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		
		int [] arr= {2,5,3,7,8,24,12};
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for(int shorted : arr) {
			System.out.print(shorted+" ");
		}
			
	}

}

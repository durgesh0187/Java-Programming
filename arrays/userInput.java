package arrays;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int n,i;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int marks[] = new int [n];
		System.out.println("enter the marks of student");
		for(i=0;i<n;i++) {
		marks[i]=sc.nextInt();
		}
		int averageMarks=0;
		for(i=0;i<n;i++) {
			averageMarks +=marks[i];
		}
		 averageMarks /=n;
		System.out.println("the average marks of student :"+averageMarks);
	}

}

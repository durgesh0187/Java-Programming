package pattern;

import java.util.Scanner;

public class numberPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int number =1;
		for(int i=1;i<=n;) {
			for(int j=1;j<=n-i;i++) {
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(number+" ");
			}
		}
		System.out.println();
	}

}

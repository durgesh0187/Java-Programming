package loop;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int a,b,c,n=sc.nextInt();
		a=0;
		b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<=n-2;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}

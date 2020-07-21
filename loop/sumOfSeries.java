package loop;

import java.util.Scanner;

public class sumOfSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		float result =0;
		for(float i=1;i<=n;i++) {
			result +=1/i;              // function work 1+1/2+1/3+1/4+1/5.....1/n;
			System.out.println(result);
		}
	}

}

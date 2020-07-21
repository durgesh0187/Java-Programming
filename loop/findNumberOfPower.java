package loop;

import java.util.Scanner;

public class findNumberOfPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i,result=1;
		for(i=0;i<b;i++) {
			result *=a;
			System.out.print(" "+result);
		}
	}

}

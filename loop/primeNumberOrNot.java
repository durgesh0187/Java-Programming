package loop;

import java.util.Scanner;

public class primeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			int i,n,count=0;
			System.out.println("enter the value");
			n=sc.nextInt();
			for(i=1;i<=n;i++) {
				if(n%i==0)
				{
					count=count+i;
				}
			}
			if(count==2)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not prime number");
			}
			
	}

}

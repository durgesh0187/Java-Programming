package loop;
import java.util.Scanner;
public class factorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int i,factorial=1;
		for(i=n;i>=1;i--) {
			factorial=factorial*i;
		}
			System.out.println(factorial);
		
	}

}

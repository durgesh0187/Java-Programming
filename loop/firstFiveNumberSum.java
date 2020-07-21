package loop;
import java.util.Scanner;
public class firstFiveNumberSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int sum=0,n;
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			System.out.println(sum);
		}
	}

}

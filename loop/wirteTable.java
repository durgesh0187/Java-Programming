package loop;
import java.util.Scanner;
public class wirteTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int tableOf=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(tableOf+"*"+i+""+"="+tableOf*i);
		}
	}

}

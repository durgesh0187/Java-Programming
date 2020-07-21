package switchCase;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ente the first number ");
		  int a=sc.nextInt();
		System.out.println("ente the second sumber");
		  int b=sc.nextInt();
		System.out.println("enter the operator");
		  sc.nextLine();
		  char operator=sc.nextLine().charAt(0);
		  int result=0;
		  switch(operator) {
		  case '+':
		  result=a+b;
		  break;
		  case '-':
			  result=a-b;
			  break;
		  case '*':
			  result=a*b;
			  break;
		  case '/':
			  result=a/b;
			  break;
		  case '%':
			  result=a%b;
			  break;
		default:
			System.out.println("invilid operation");
			  }
		  System.out.println("result : "+result);
	}

}

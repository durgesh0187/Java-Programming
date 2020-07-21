package switchCase;
import java.util.Scanner;
public class dayOfWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		int dayOfWeek=sc.nextInt();
		System.out.println("press 1 for sunday");
		System.out.println("press 2 for monday");
		System.out.println("press 3 for tuesday");
		System.out.println("press 4 for wednesday");
		System.out.println("press 5 for thursday");
		System.out.println("press 6 for friday");
		System.out.println("press 7 for saturday");
		switch(dayOfWeek) {
		case 1:
			System.out.println("i am on leave ");
			break;
		case 2:
			System.out.println("i am in office");
			break;
		case 3:
			System.out.println("i am in collage");
			break;
		case 4:
			System.out.println("i am in home");
			break;
		case 5:
			System.out.println("go to temple");
			break;
		case 6:
			System.out.println("");
			break;
		case 7:
			System.out.println("i am in home");
			break;	
		default:
			System.out.println("invilid");
		}
	}

}


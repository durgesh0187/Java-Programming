package ifElseLogicalOperator;

public class notOperator {

	public static void main(String[] args) {
		
		int grade =10;
		if(!(grade==10 || grade==12)) {
			System.out.println("you can not give board exam");
		}else {
			System.out.println("you can give board exam");
		}
	}

}

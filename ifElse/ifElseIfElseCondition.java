package ifElse;

public class ifElseIfElseCondition {

	public static void main(String[] args) {
		
		int num=11;
		if(num<10) {
			System.out.println("number is less the 10");
		}else if(num>10 && num<=20) {
			System.out.println("number is greater the 10 and less then 20");
		}else if(num>20 && num<30) {
			System.out.println("number is greater then 20 and less then 30");
		}else {
			System.out.println("number is greater the 40");
		}

	}

}

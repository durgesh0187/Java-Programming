package nestedIfElseCondition;

public class ternayOperatorInNestedIfElse {

	public static void main(String[] args) {
		int a=12,b=8,c=10;
		int result=0;
		
		result=a>b ? a>c ? a:c : b>c ? b:c;
		System.out.println("largest of the three number"+result);
	}

}

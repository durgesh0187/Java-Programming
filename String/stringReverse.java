package String;

public class stringReverse {

	public static void main(String[] args) {
		
		String  a="i love java,the coffee";
		
		int i=a.length()-1;
		String ans="";
		while(i>=0) {
			while (i>=0 && a.charAt(i) == ' ') i--;
			
			int j=i;
			while(i>0 && a.charAt(i) !=' ') i--;
			
			if(ans.isEmpty()) {
				ans=ans.concat(a.substring(i+1,j+1));
			}else {
				ans=ans.concat(" "+a.substring(i+1,j+1));
			}
		}
		System.out.println(ans);

	}

}

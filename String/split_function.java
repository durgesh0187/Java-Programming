package String;

public class split_function {

	public static void main(String[] args) {
		//split function
		
		
		String cars="Hyundai,Marrti,swift,wagnor";
		String allcars[]=cars.split(","); // any chararcter remove  
		for(String car:allcars) {
			System.out.println(car);
		}

	}

}

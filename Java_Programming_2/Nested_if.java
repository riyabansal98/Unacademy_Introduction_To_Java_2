package Java_Programming_2;

public class Nested_if {

	public static void main(String[] args) {
		

		int age = 40;
		int weight = 90;
		
		if(age >= 18) {
			
			if(weight > 50) {
				System.out.println("You are eligible to donate blood.");
			}else {
				System.out.println("Not enough weight");
			}
			
		}else {
			System.out.println("Not an eligible age to donate blood.");
		}
		
		

	}

}

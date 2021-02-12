package Java_Programming_2;

public class Check_Leap_year {

	public static void main(String[] args) {
		

		//A year is a leap year if any of the following conditions are true
		//1. if it is divisible by 4 and not 100
		//2. If it is divisible by 400. 
		
		int year = 2100;
		
		if(((year % 4 == 0 )&& (year % 100 != 0)) || (year % 400 == 0)) {
			
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year");
		}

	}

}

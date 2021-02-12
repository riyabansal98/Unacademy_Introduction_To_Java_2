package Java_Programming_3;

public class Pattern_1 {

	public static void main(String[] args) {
		

		int rows = 15;
		
		for(int i = 1; i <= rows; i++) {
			
			//i = 1,  j = (1, 6)
			//i = 2 , j = (1, 5)
			//i = 3,  j = (1, 4)
			
			for(int j = rows; j >= i; j--) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}

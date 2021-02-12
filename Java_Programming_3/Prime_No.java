package Java_Programming_3;

public class Prime_No {

	public static void main(String[] args) {
		

		int num = 8;
		
		int a = 0;
		int b = 1;
		
		for(int i = 1; i <= num; i++) {
			System.out.println(a);
			
			int sum = a + b;
			a = b;
			b = sum;
			
		}

	}

}

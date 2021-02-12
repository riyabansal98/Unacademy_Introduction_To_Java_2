package Java_Programming_6;

public class Log {

	public static void main(String[] args) {
		

		int num = 8;
		int base = 2;
		int output = log(num, base);
		System.out.println(output);

	}

	private static int log(int num, int base) {
		//num = 8, base = 2;
		int counter = 0;
		
		while(num != 1) {
			
			counter++;
			num = num / base;
		}
		
		return counter;
	
	}

}

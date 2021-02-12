package Java_Programming_6;

public class ArmstrongNumber {

	public static void main(String[] args) {
		

		int num = 16876;
		
		boolean output = isArmstrong(num);
		
		System.out.println(output);

	}

	private static boolean isArmstrong(int num) {
		
		//find the no of digits in num
		int nod = numberOfDigits(num);
		
		int ans = 0;
		int temp = num;
		
		while(num != 0) {
			
			int rem = num % 10; //4
			ans += Math.pow(rem, nod); // (3, 4) -> 3^4
			
			num = num / 10;
		}
		
		if(temp == ans) {
			return true;
		}else {
			return false;
		}
		
	}

	private static int numberOfDigits(int num) {
		
		//1634 -> 163 -> 16 -> 1 -> 0
		int counter = 0;
		while(num != 0) {
			counter++;
			num = num / 10;
		}
		
		return counter;
		
	}

}

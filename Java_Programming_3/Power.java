package Java_Programming_3;

public class Power {

	public static void main(String[] args) {
		

		//a**b = a multipliesd b times
		
		//2**3 = 2*2*2
		
		int a = 3;
		int b = 4;
		
		int ans = 1;
		
		for(int i = 1; i <= b; i++) {
			ans = ans * a;
		}
		
		System.out.println(ans);

	}

}

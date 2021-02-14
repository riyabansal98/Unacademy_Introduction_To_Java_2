package Java_Programming_10;

import java.util.Arrays;

public class SOE {

	public static void main(String[] args) {
		

		SOE(25);

	}

	private static void SOE(int n) {
		

		boolean primes[] = new boolean[n + 1];
		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;
		
		for(int table = 2; table * table <= n; table++) {
			
			if(primes[table] == false) {
				continue;
			}
			
			for(int multiplier = 2; table * multiplier <= n; multiplier++) {
				
				primes[table * multiplier] = false;
			}
		}
		
		for(int i = 2; i < primes.length; i++) {
			
			if(primes[i]) {
				System.out.println(i);
			}
		}
	}

}

package Java_Programming_9;

import java.util.ArrayList;

public class Sum_of_Two_Arrays {

	public static void main(String[] args) {
		

		int[] one = {	9, 9, 9};
		int[] two = {9, 9, 9 ,9};
		
		ArrayList<Integer> res = sumOfArrays(one, two);
		
		System.out.println(res);
	}

	private static ArrayList<Integer> sumOfArrays(int[] one, int[] two) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		int i = one.length - 1;
		int j = two.length - 1;
		
		int carry = 0;
		
		while(i >= 0 || j>= 0) {
			int sum = 0; 
			
			sum += carry;
			
			if(i >= 0) {
				sum += one[i];
				
			}
			
			if(j >= 0) {
				sum += two[j];
			}
			
			int rem = sum % 10;
			ans.add(0, rem);
			
			carry = sum / 10;
			
			i--;
			j--;
		}
		
		if(carry != 0) {
			ans.add(0, carry);
		}
		
		return ans;
		
	}

}

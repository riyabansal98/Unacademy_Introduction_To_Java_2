package Java_Programming_8;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		

		int[] one = {1, 1, 2, 3, 4, 7 ,8};
		int[] two = {0, 1, 3, 3, 4, 8};
		
		ArrayList<Integer> list = intersection(one, two);

		System.out.println(list);
	}

	private static ArrayList<Integer> intersection(int[] one, int[] two) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while(i < one.length && j < two.length) {
			
			if(one[i] < two[j]) {
				i++;
			}else if(one[i] > two[j]) {
				j++;
			}else {
				//found a match
				ans.add(one[i]);
				i++;
				j++;
			}
		}

		return ans;
	}

}

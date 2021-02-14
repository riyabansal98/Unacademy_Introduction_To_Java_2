package Java_Programming_10;

public class Palindromic_Substrings {

	public static void main(String[] args) {
		

		String str = "ababa";
		
		System.out.println(countPalindromicSS(str));

	}

	//Time Complexity - O(n^2)
	private static int countPalindromicSS(String str) {
		
		int count  = 0;
		
		//odd length of s
		//we are placing the axis over each char
		for(int axis = 0; axis < str.length(); axis++) {
			
			//for a particular axis, we try to expand its orbt, 
			for(int orbit = 0;(axis - orbit >= 0) && (axis + orbit < str.length()); orbit++) {
				
				if(str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				}else {
					break;
				}
			}
		}
		
		for(double axis = 0.5; axis < str.length(); axis++) {
			
			for(double orbit = 0.5; (axis - orbit >= 0) && (axis + orbit < str.length()); orbit++) {
				if(str.charAt((int)(axis - orbit)) == str.charAt((int)(axis + orbit))) {
					count++;
				}else {
					break;
				}
			}
		}
		
		return count;

	}

}

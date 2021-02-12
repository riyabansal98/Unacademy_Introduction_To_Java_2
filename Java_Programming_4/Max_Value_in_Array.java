package Java_Programming_4;

public class Max_Value_in_Array {

	public static void main(String[] args) {
		

		int[] arr = {10, 2, 33, 230, 50};
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}


}

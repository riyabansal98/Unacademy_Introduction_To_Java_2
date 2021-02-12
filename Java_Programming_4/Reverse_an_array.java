package Java_Programming_4;

public class Reverse_an_array {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			// swap
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			
			//shifting of variables
			left++;
			right--;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}

}

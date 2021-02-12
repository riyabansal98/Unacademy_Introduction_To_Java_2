package Java_Programming_4;

public class Valid_Mountain_Array {

	public static void main(String[] args) {
		

		int[] arr = {0, 2, 4, 5, 2, 1, 0};

		int i = 0;
		
		//walking up
		while(i + 1 < arr.length && arr[i] < arr[i + 1]) {
			i++;
		}
		
		//walking down
		while(i + 1 < arr.length && arr[i] > arr[i + 1]) {
			i++;
		}
		
		if(i == arr.length - 1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}

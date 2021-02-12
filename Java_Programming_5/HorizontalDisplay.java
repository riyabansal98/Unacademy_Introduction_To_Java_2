package Java_Programming_5;

public class HorizontalDisplay {

	public static void main(String[] args) {
		

		int[][] arr = {
				{10, 20, 30, 40}, 
				{50, 60, 70, 80}, 
				{90, 100, 110, 120}};
		
		//print horizontal display for this array
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0;  j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}

	}

}

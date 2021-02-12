package Java_Programming_5;

public class WaveDisplay {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30, 40 }, 
						{ 50, 60, 70, 80 }, 
						{ 90, 100, 110, 120 } };

		for (int col = 0; col < arr[0].length; col++) {

			if (col % 2 == 0) {

				// go down (top to bottom)

				for (int row = 0; row < arr.length; row++) {

					System.out.print(arr[row][col] + " ");
				}
			} else {

				//go up (bottom to up)
				for (int row = arr.length - 1; row >= 0; row--) {

					System.out.print(arr[row][col] + " ");
				}
			}
		}

	}

}

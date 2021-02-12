package Java_Programming_5;

public class Spiral_Display {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30, 40 }, 
						{ 50, 60, 70, 80 }, 
						{ 90, 100, 110, 120 } };

		int rowMin = 0;
		int rowMax = arr.length - 1;
		int colMin = 0;
		int colMax = arr[0].length - 1;

		int counter = 0;

		int nel = arr.length * arr[0].length;
		while (counter < nel) {
			
			
			for (int row = rowMin; counter < nel && row <= rowMax; row++) {

				// (0, 0), (1,0), (2, 0)
				//(1, 1)
				System.out.print(arr[row][colMin] + " ");
				counter++;
			}
			colMin++;

			for (int col = colMin; counter < nel && col <= colMax; col++) {

				// (2, 1), (2, 2), (2, 3)
				System.out.print(arr[rowMax][col] + " ");
				counter++;
			}
			rowMax--;

			for (int row = rowMax; counter < nel && row >= rowMin; row--) {

				// (1, 3), (0, 3)
				System.out.print(arr[row][colMax] + " ");
				counter++;
			}
			colMax--;

			for (int col = colMax; counter < nel && col >= colMin; col--) {

				// (0, 2), (0, 1)
				System.out.print(arr[rowMin][col] + " ");
				counter++;
			}

			rowMin++;
		}
	}

}

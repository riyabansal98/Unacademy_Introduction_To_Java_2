package Java_Programming_4;

public class ArrayDemos {

	public static void main(String[] args) {
		

		//no actual array exists as of now. 
		//No memory has been allocated to the array in RAM. 
		//arr is just a reference in the memory.
		
		int[] arr;
		arr = new int[5];
		
		System.out.println(arr);
		
		//length
		System.out.println(arr.length);
		System.out.println("---------------");
		
		//get
		//default values in the array is 0. 
		//arr[0] trying to get the first value present at the 0th index
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		
		System.out.println("--------------");
		//set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("-------------");
		
		//simple for loop
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("--------------");
		
		//enhanced for loop
		//only the reading the values
		for(int val: arr) {
			System.out.print(val + " ");
		}
		

	}

}

package Java_Programming_6;

public class functionsDemo {
	
	public static int GLOBAL = 20;
	public static void main(String[] args) {
		// Part 1
		System.out.println("--------Part-1---------");
		System.out.println("hello");
		// method calling
		addition();
		System.out.println("bye");

		// Part-2a
		System.out.println("--------Part-2a--------");
		System.out.println("hello");
		// function with arguements
		addition(2, 12);
		addition(2, 13, 13);

		// Part-2b
		System.out.println("----------Part-2b---------");
		System.out.println("hello");
		int sum = additionRV(2, 12);
		System.out.println(sum);
		
		//Part 3
		System.out.println("--------Part 3-------------");
		int one = 10;
		int two = 20;
		int sum1 = DemoScopes(one, two);
		System.out.println(sum1);
		
		//Part 4
		System.out.println("-------Part 4-------------");
		System.out.println(GLOBAL);  //20
		int GLOBAL = 200;
		System.out.println(GLOBAL);  //200
		DemoGlobalScopes(one); //10
		
		//Part 5-Pass by value
		System.out.println("-------Part 5--------------");
		System.out.println(one + "  "+ two);
		swap(one, two);
		System.out.println(one + ", "+ two);
		
		
	}

	private static void swap(int one, int two) {
		
		System.out.println(one + ", "+ two);
		int temp = one;
		one = two;
		two = temp;
		System.out.println(one + ", " + two);
		
	}

	private static void DemoGlobalScopes(int one) {

		GLOBAL = GLOBAL + 40; //40 + 20 = 60
		int GLOBAL = 30;
		GLOBAL = GLOBAL + 40; //40 + 30 = 70 (local variable)
		int sum = one + GLOBAL; //70 + 10 = 80
		System.out.println(sum);
		
	}

	private static int DemoScopes(int one, int another) {
		
		int sum = one + another;
		return sum;
		
	}

	private static int additionRV(int i, int j) {

		int sum = i + j;
		return sum;
	}

	private static void addition(int i, int j, int k) {

		int sum = i + j + k;

	}

	private static void addition(int a, int b) {

		int sum = a + b;
		System.out.println(sum);

	}

	// method declaration with no arguements
	public static void addition() {

		int a = 2;
		int b = 3;
		int sum = a + b;
		System.out.println(sum);
	}

}

package Java_Programming_8;

import java.util.Scanner;

public class Strings_Demo {

	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);
		
		//String str = scn.nextLine();
		//System.out.println(str);
		
		String str = "hello";
		System.out.println(str);
		
		//Part 1: Length of string
		System.out.println(str.length());
		
		//Part 2: CharAt Limit: 0 -> Length - 1
		char ch = str.charAt(0);
		System.out.println(ch);
		
		System.out.println(str.charAt(str.length() - 1));
		
		System.out.println("--------------");
		
		str = "hello";
		
		//Part 3: Substring
		//h, he, hel, hell, hello, e, el, ell, ello, l, ll, llo, l, lo
		System.out.println(str.substring(2, 4)); //[2, 4)
		System.out.println(str.substring(3, 4)); //[3, 4)
		System.out.println(str.substring(3, 3)); //[3, 3)
		System.out.println(str.substring(0, 5)); //[0, 5) 0, 1, 2, 3, 4
		System.out.println(str.substring(3)); //[3, end of string)
		//System.out.println(str.substring(4, 2)); //error
		
		//Part 4: Concatenation of strings
		
		String s1 = "hi";
		String s2 = "bye";
		String s3 = s1 + s2;
		System.out.println(s1 + " " + s2 + " " + s3);
		String s4 = s1.concat(s2);
		System.out.println(s1 + " " + s2 + " " + s4);
		
		
		System.out.println("----------------");
		
		//Part 5: Index of
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("eL"));
		
		
		System.out.println("---------------");
		
		//Part 6: Starts with
		System.out.println(str.startsWith("He"));
		
		//Part 7:Equals
		
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		str = "hello";
		
		System.out.println(s1.equals(str));
		
		//Part 8: Replace with
		str = str.replace('l', 't');
		System.out.println(str);

	}

}

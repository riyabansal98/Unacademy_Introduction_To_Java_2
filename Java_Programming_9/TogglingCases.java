package Java_Programming_9;

public class TogglingCases {

	public static void main(String[] args) {

		System.out.println(toggleCase("absAFGdG"));

	}

	private static String toggleCase(String string) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			
			char ch = string.charAt(i);
			char ans = ' ';
			
			if(ch >= 'a' && ch <= 'z') {
				//change to upper case
				ans = (char)(ch - 'a' + 'A');
			}else {
				//change to lower case
				ans = (char)(ch + 'a' - 'A'); 
			}
			
			sb.append(ans);
		}
		
		return sb.toString();

	}

}

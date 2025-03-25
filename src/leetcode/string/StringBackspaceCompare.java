package leetcode.string;

public class StringBackspaceCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String leftString = "ABC#CPQR###D";
		String rightString = "ABC";
		String leftStringFinal = "";
		//System.out.println(leftString.substring(0, leftString.length() - 2));
		
		  
		for (Character character : leftString.toCharArray()) {
			if (character == '#') {
				leftStringFinal =leftStringFinal.substring(0, leftStringFinal.length() - 1);
			} else {
				leftStringFinal = leftStringFinal + character;
			}
		}
		System.out.println(leftStringFinal);
		 
	}

}

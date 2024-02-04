package leetcodearraystring;

import java.util.HashMap;
import java.util.Map;

public class WordPatternMatch {

	public static void main(String[] args) {
		String pattern = "abba", s = "dog cat cat dog";
		
		// WAP - To check if String matches a pattern 
		//Scenario 1
		//String pattern = "abba", s = "water fire fire water"; 
		//Output - Pattern matches
		
		//Scnario 2
		//String pattern = "abba", s = "water fire air water"; 
		//Output - Pattern does not match
		
		String[] textArray = s.split(" ");
		int index = 0;
		Map hm = new HashMap<String,String>();
		for(char eachChar: pattern.toCharArray()) {
			hm.put(eachChar, textArray[index]);
			index = index+1;
		}
		
		String reconstructed = "";
		for(char eachChar: pattern.toCharArray()) {
			reconstructed = reconstructed + hm.get(eachChar)+" ";
		}
		
		if(s.trim().equals(reconstructed.trim())) {
			System.out.println(s + " : Pattern Matched : " + reconstructed);
		}else {
			System.out.println(s + " : Pattern Not Matched : " + reconstructed);
		}

	}

}

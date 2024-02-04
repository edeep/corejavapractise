package leetcodearraystring;
/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 
 */
public class ValidAnagram {

	public static void main(String[] args) {
		
		String s = "anagram", t = "nagaram";
		//String s = "rat", t = "cat";
		int count = 0;
		for(char sChar: s.toCharArray()) {
			if(t.indexOf(sChar)>-1) {
				count = count + 1;
				int occuringIndex = t.indexOf(sChar);
				/*System.out.println( occuringIndex);
				System.out.println(t.substring(0, occuringIndex));
				System.out.println(t.substring(occuringIndex+1));*/
				t = t.substring(0, occuringIndex) + t.substring(occuringIndex+1);
				System.out.println(t);
				
			}else {
				break;
			}
		}
		
		if(count == s.length()) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}

	}

}

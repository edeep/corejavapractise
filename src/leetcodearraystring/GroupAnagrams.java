package leetcodearraystring;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 */

public class GroupAnagrams {
	
	static void printPermutn(String str, String ans)
    {
        // If string is empty
        if (str.length() == 0) {
        	System.out.println(ans + " ");
        	System.out.println(" Returning.............." );
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            // ith character of str
            char ch = str.charAt(i);
            
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
            System.out.println("Character from String:" + str +" at index:"+ i +"is:" + ch +" and ros is:" + ros);
 
            // Recursive call
    		System.out.println("Going to call printPermutn . Word is>" + ros + "  ans+ch>" + ans + ch + " ");

            printPermutn(ros, ans + ch);
        	System.out.println(" ############### " );

        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String s = "eat";
		System.out.println("Start Code - Going to call printPermutn . Word is:" + s + "  ans:" + " ");

        printPermutn(s, "");
    }

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		for(String eachWord: strs) {
			for(char eachLetter: eachWord.toCharArray()) {
				// eat ate tea 
				// aet eta tae
				// tae aet eta
			}
			
		}
		
		
	}*/

}

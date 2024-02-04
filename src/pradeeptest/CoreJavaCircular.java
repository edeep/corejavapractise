package pradeeptest;

public class CoreJavaCircular {

	public static void main(String[] args) {
		
		String[] allWords = {"aaa","abc","cbd","dea"};
		
		new CoreJavaCircular().checkIfCircularMethod1(allWords);

	}
	
	public void checkIfCircularMethod2(String[] allWords) {
		
	}
	
	public void checkIfCircularMethod1(String[] allWords) {
		char previousWordLastChar =  '1';
		char firstWordFirstChar = allWords[0].charAt(0);

		int noofWords = 1;
		int counter = 0;
		for(String word: allWords) {
			char currentWordFirstChar = word.charAt(0);
			System.out.println("checking word" + word);

			if(counter ==0) {
				//DO nothing
			}
			else if(counter == allWords.length )
			{
				if(currentWordFirstChar == previousWordLastChar) {
					char currentWorkLastChar = word.charAt(word.length()-1);
					if(currentWorkLastChar == firstWordFirstChar) {
						noofWords = noofWords+1;	
					}
					
				}
				
			}
			else if(currentWordFirstChar == previousWordLastChar) {
				noofWords = noofWords+1;
			}
			previousWordLastChar = word.charAt(word.length()-1);
			counter = counter+ 1;
			
		}
		System.out.println("No of words" + noofWords);
		if(noofWords == allWords.length) {
			System.out.println("Circular...");
		}else {
			System.out.println("Not Circular...");
		}
		
	}

}

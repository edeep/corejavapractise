package pradeeptest;

import java.util.ArrayList;
import java.util.List;

public class TestContinueAndBreak {

	public static void main(String[] args) {
		
		List<String> testData = new ArrayList<String>();
		testData.add("A");
		testData.add("B");
		testData.add("C");
		testData.add("D");
		
		for(String data: testData) {
			System.out.println("Going to check: " + data);
			if(data.equals("A")) {
				System.out.println("A");
			}else if (data.equals("B")) {
				System.out.println("B");
				continue;
			}
			
		

	}
	}
	}



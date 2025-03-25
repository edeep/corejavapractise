package leetcodearrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumberOptimized {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numberGroup[] = {1,2,3,4,5,6,7,8,9};
		Integer total = 7;
		Map<String, Integer> hm = 
				new HashMap<String, Integer>();
		String toFindDifferenceAsString ="NA";
		
		for(int i=0; i<numberGroup.length;i++) {
			Integer toFindDifference = total-numberGroup[i];
			toFindDifferenceAsString = toFindDifference.toString();
			if(hm.get(String.valueOf(numberGroup[i]))==null) {
				hm.put(toFindDifferenceAsString, i);
			}else if(hm.get(String.valueOf(numberGroup[i]))!=null ) {
				System.out.println(hm.get(String.valueOf(numberGroup[i])) 
						+ "-" + i);
				break;
			}
			
		}
	}

}

package lledcodehashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1,2,3
		Integer[] nums = {100,4,200,1,3,2,101};
		List<Integer> numsAsList =  Arrays.asList(nums);
		Set<Integer> tSet = new TreeSet<Integer>(numsAsList);
        int i = 0;
        int previousNo = -1;
        int countOfConsecutiveNo = 0;
        Map<Integer,String> hm =  new HashMap<Integer,String>();
        String consequtiveNo ="";
        for (Integer x : tSet) {
        	if(i !=0) {
        		if(x - previousNo == 1) {
        			if(countOfConsecutiveNo ==0) {
        				consequtiveNo = previousNo + ","  + x;
        			}else {
        				consequtiveNo = consequtiveNo + ","  + x;	
        			}
        			
        			countOfConsecutiveNo = countOfConsecutiveNo + 1;

        		}else {
        			System.out.println(countOfConsecutiveNo + " : " + consequtiveNo);
        			hm.put(countOfConsecutiveNo+1,consequtiveNo);
        			countOfConsecutiveNo = 0;
        			consequtiveNo ="";
        		}
        		
        	}
        	i = 1+1;
        	previousNo = x;
        }
        
        TreeMap<Integer,String> sorted = new TreeMap<>(hm);
        
        System.out.println(sorted.lastEntry());
        
            
	}

}

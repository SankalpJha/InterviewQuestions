package com.fourhorsemen;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Write a function that, when passed a list and a target sum, returns, 
 * efficiently with respect to time used, two distinct zero-based indices of any two of the numbers, 
 * whose sum is equal to the target sum. If there are no two numbers, the function should return null.
 * For example, findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10) should return a single dimensional array 
 * with two elements and contain any of the following pairs of indices:
 * 0 and 3 (or 3 and 0) as 3 + 7 = 10
 * 1 and 5 (or 5 and 1) as 1 + 9 = 10
 * 2 and 4 (or 4 and 2) as 5 + 5 = 10
 * 
 */

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        
    	Integer[] result=null;
    	HashMap<Integer[], Integer> tempResult = new HashMap<>();
    	
    	for(int i=0; i<list.length; i++) {
    		for(int j=1; j<list.length; j++) {
    			Integer[] tmpArr = {i,j};		
    			if(list[i]+list[j]==sum) {
    				tempResult.put(tmpArr, sum);
    			}
    		}
    	}
    	
    	if(!tempResult.isEmpty()) {
    		result = (Integer[]) tempResult.keySet().toArray()[0];
    	}
    	
    	return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
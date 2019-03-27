package com.fh;

import java.util.HashMap;
import java.util.Map;

/**
 * A child is running up the staircase with n steps and can hop either 1 step, 2 step or 3 step
 * at a time. Implement a method to count how many possible ways the child can run up the stairs.
 * 
 * @author Sankalp Jha
 *
 */
public class NSteps {
	public static void main(String[] args) {
		int numOfSteps = 11;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int ways = getNumberOfWays(numOfSteps, map);
		System.out.println("To climb " + numOfSteps +" steps there are "+ ways +" number of ways");
	}

	private static Integer getNumberOfWays(Integer numOfSteps, Map map) {

		if(numOfSteps == 1) {
			return 1;
		}else if(numOfSteps == 2) {
			return 2;
		}else if(numOfSteps == 3) {
			return 4;
		}else {
			if (map.containsKey(numOfSteps)) {
				return (Integer) map.get(numOfSteps);
			}else {
				map.put(numOfSteps, getNumberOfWays(numOfSteps-1, map) + getNumberOfWays(numOfSteps-2, map) + getNumberOfWays(numOfSteps-3,map)); 
				return  (Integer) map.get(numOfSteps);
			}
		}
	}
}

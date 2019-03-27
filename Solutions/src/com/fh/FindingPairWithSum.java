package com.fh;

import java.util.HashSet;

public class FindingPairWithSum {
	public static void main(String[] args) {
		int[] A = {1,2,3,9};
		//int[] A = {4,4,1,2};
		int sum = 8;
		boolean res = hasPairWithSum(A,sum);
		if(res) {
			System.out.println("Given Array has pair with sum " + sum);
		}else {
			System.out.println("Given Array don't have pair with sum " + sum);
		}

	}


	private static boolean hasPairWithSum(int[] A, int sum) {
		HashSet<Integer> comp = new HashSet<>();
		for(int i : A) {
			if(comp.contains(i)) {
				return true;
			}
			comp.add(sum-i);
		}
		return false;
	}


}

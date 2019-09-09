package com.fourhorsemen;
/*
 * Given an array of integers, find the first missing positive integer 
 * in linear time and constant space. In other words, find the lowest positive 
 * integer that does not exist in the array. The array can contain duplicates 
 * and negative numbers as well.
 */
import java.util.TreeSet;

public class FirstPositiveNumber {

	public static void main(String[] args) {
		
		//int[] input = {3, 4, -1, 1};
		
		int[] input = {1, 2, 0, 2, 1, 3};
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int i=1; i<=input.length; i++) {
			set.add(i);
		}
		
		for(int i=0; i<input.length; i++) {
			if(set.contains(input[i]))
				set.remove(input[i]);
		}
		
		System.out.println(set.pollFirst());
	}
}

package com.fourhorsemen;

import java.util.HashSet;
import java.util.Set;

/*
 * Implement the uniqueNames method. When passed two arrays of names, it will return an array containing the 
 * names that appear in either or both arrays. The returned array should have no duplicates.
 * For example, calling MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'}) 
 * should return an array containing Ava, Emma, Olivia, and Sophia in any order.
 * 
 */
public class UniqueName {

	public static String uniqueNames(String[] names1, String[] names2)  {

		Set<String> nameSet = new HashSet<String>();
		for(int i=0; i<names1.length; i++) {
			nameSet.add(names1[i]);
		}
		
		for(int i=0; i<names2.length; i++) {
			nameSet.add(names2[i]);
		}
		
		return nameSet.toString();
		
		
		
	}

	public static void main(String[] args) {
		String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
		String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
		String uniqueNames = UniqueName.uniqueNames(names1, names2);
		System.out.println(uniqueNames);
	}
}


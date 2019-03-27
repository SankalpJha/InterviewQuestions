package com.fh;

import java.util.HashSet;
import java.util.Set;

public class FirstReoccurance {
	public static void main(String[] args) {

		String input = "eftgedswfhfehyj";

		Set<Character> values = new HashSet<>();
		char[] inpToChar = input.toCharArray();
		for(int i=0; i<inpToChar.length; i++) {
			if(! (values.add(inpToChar[i]))) {
				System.out.println(inpToChar[i]);
				break;
			}
		}
	}
}

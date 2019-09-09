package com.fourhorsemen;
/*
 * Given two strings you need to file if the 2nd string is right rotated of the  
 * first string or not, if it is right rotated then return 1 else return -1. 
 * E.g. "plesam" is the right rotated word of "sample"
 * E.g. "cab" is right rotated word of "abc"
 */
import java.util.HashSet;
import java.util.Set;

public class RightRotation {
	
	public static void main(String[] args) {
		String s1 = "prime";
		String s2 = "imepr";
		
		int res = isRightRotated(s1,s2);
		
		System.out.println(res);
	}
	
	public static int isRightRotated(String originalWord, String testWord) {
		
		Set<String> wordRotatedSet = new HashSet<>();
		generatedRotatedWords(originalWord, originalWord.length(), wordRotatedSet);
		if(wordRotatedSet.contains(testWord)) {
			return 1;
		} 
		else {
			return -1;
		}
		
	
	}
	
	public static String generatedRotatedWords(String inpString, int turnsLeft, Set wordRotatedSet){
		wordRotatedSet.add(inpString);
		if(turnsLeft==0)
			return "";
		
		char[] orgWord = inpString.toCharArray();
		char[] resultWord = new char[inpString.length()];
		
		for(int i=0; i<orgWord.length;i++) {
			if(i==orgWord.length-1) {
				resultWord[0]=orgWord[orgWord.length-1];
			}
			else {
				resultWord[i+1]=orgWord[i];
			}
		}
		turnsLeft--;
		return generatedRotatedWords(new String(resultWord), turnsLeft, wordRotatedSet);
	}

}

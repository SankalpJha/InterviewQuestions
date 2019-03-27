package com.fh;

import java.util.HashMap;

public class DecodeMessage {

	public static void main(String[] args) {
		String data = "123";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		map.put("g", 7);		
		map.put("h", 8);
		map.put("i", 9);
		map.put("j", 10);
		map.put("k", 11);
		map.put("l", 12);
		map.put("m", 13);
		map.put("n", 14);
		map.put("o", 15);
		map.put("p", 16);
		map.put("q", 17);
		map.put("r", 18);
		map.put("s", 19);
		map.put("t", 20);
		map.put("u", 21);
		map.put("v", 22);
		map.put("w", 23);
		map.put("x", 24);
		map.put("y", 25);
		map.put("z", 26);

		int ways = numWays(data);
		System.out.println(ways);
	}

	private static int numWays(String data) {
		int counter=0;
		StringBuffer sb = new StringBuffer();
		char[] c = data.toCharArray();
		for(int i=0; i<=c.length; i++) {
			int j=i+1;
			if(j<c.length) {
				sb.append(c[i]);
				sb.append(c[j]);
				System.out.println(sb.toString());
				int val=0;
				if (val<=26) {
					counter +=1;
					System.out.println(counter);
				}
			}
		}

		return counter+1;
	}
}

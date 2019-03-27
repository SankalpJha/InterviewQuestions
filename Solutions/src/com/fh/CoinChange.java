package com.fh;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {

	public static void main(String[] args) {
		int[] coins = {5,2,1};
		int amount = 11;
		int numOfCoins = 0;	
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = getChange(amount, coins, 0, numOfCoins, map);

		System.out.println("Amount of " + amount + " can be changed in " + count + " coins.");
	}

	private static int getChange(int amount, int denom[], int index, int numOfCoins, Map map) {
		if(amount==0) {
			return numOfCoins;
		}else if(map.containsKey(amount)){
			return (Integer) map.get(amount);
		} else {
			int remain = amount % denom[index];
			numOfCoins += amount/denom[index];
			map.put(remain, getChange(remain, denom, index+1, numOfCoins, map));
			return (Integer) map.get(remain);
		}
	}

}


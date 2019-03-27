package com.fh;

public class JumpGame {
	public static void main(String[] args) {
		//int[] Input = {2,3,1,1,4};
		int[] Input = {3,2,1,0,4};
		boolean isJumpPossible=jumpPossibility(Input);
		System.out.println(isJumpPossible);

	}

	private static boolean jumpPossibility(int[] nums) {
		int length = nums.length;
		int sum = 0;
		
		for (int i=0; i<nums.length;i=sum) {
			if(nums[i]==(length-1) || (nums[0]==0 && length==1)|| nums[0]==1) {
				return true;
			}else {
				if(nums[i]==0)
					return false;
				sum = sum + nums[i];
				if(sum==(length-1))
					return true;
			}
		}
		return false;

	}
}

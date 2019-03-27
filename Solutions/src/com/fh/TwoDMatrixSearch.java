package com.fh;

public class TwoDMatrixSearch {

	public static void main(String[] args) {
		int[][] A = { {1,2,3,4}, 
					  {5,6,7,8}, 
					  {9,10,11,12}, 
					  {13,14,15,16} };
		int num = 6;

		boolean res = searchMatrix(A,num);
		System.out.println(res);

	}

	private static boolean searchMatrix(int[][] A, int num) {
		if(A[0].length==0 || A.length==0)
			return false;

		int row = 0;
		int col = A.length -1;

		while(row < A[0].length && col >= 0) {
			if(A[row][col] == num)
				return true;
			if(A[row][col] < num)
				row++;
			else
				col--;
		}
		return false;
	}
}
package com.fh;

public class ArrayIntersection {
	public static void main(String[] args) {
		int[] A = {2,4,6,7,11,13,15,18};
		int[] B = {3,5,6,8,12,13,15,17};
		int[] C = {4,6,9,10,14,15,19,21};
		
		int[] result;
		
		result = getIntersection(A,B,C);
	}

	private static int[] getIntersection(int[] A, int[] B, int[] C) {
		int x=0;
		int y=0;
		int z=0;
		int [] res;
		while(! outOfBound()) {
			if(A[x]==B[y] && B[y]==C[z]) {
				x++; y++; z++
				res.
			}else if(B[y])
		}
		return null;
	}

}

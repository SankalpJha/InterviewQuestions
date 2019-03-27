
public class Solution {
	public static void main(String[] args) {
		//int A[] = {4,2,5,3,7,9,6};	
		//int A[] = {6,1,2};
		int A[] = {5,1,6,2,4,7,9,10,8};
		int l=A.length;
		int count=0;
		for(int i=0; i<A.length; i++) {
			if(i==A[i]) {
				if((l-(i+1))==A[i]) {
					for(int j=i+1; j<l; j++) {
						if(A[j]>A[i]) {
							count++;
						}
					}
				}
			}
			if(count==A[i]) {
				System.out.println(A[i]);
			}
		}
	}
}

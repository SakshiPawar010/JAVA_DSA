/*
 * Maximum subarray sum:
 * 	Given an integer array of size N.
 * 	Find the contiguous subarray (containing atleast onr number)which has the largest sum and return its sum.
 * 	Input:[-2,1,-3,4,-1,2,1,-5,4]
 * 	Output:6
*/

//Brute Force Approach

class MaxSubarraySum{
	public static void main(String [] args){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		
		int maxSum=Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int sum = 0;
				for(int k=i; k<=j; k++){
					sum = sum + arr[k];
				}

				if(sum>maxSum){
					maxSum=sum;
				}	
			}
		}
		System.out.println(maxSum);
	}
}

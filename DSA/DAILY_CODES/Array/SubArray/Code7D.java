/*
 * Maximum subarray sum:
 *      Given an integer array of size N.
 *      Find the contiguous subarray (containing atleast one number)which has the largest sum and return its sum by Kadane's Algorithm Approach.
 *      Input:[-2,1,-3,4,-1,2,1,-5,4]
 *      Output:6
*/

//Kadane's Algorithm Approach

class KMaxSubarraySum{
        public static void main(String[]args){
                int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};

                int maxSum = Integer.MIN_VALUE;
		int sum=0;

                for(int i=0; i<arr.length; i++){
                                sum = sum + arr[i];

                                if(sum>maxSum){
                                        maxSum = sum;
                                }

				if(sum<0){
					sum = 0;
				}
                }
                System.out.println(maxSum);
        }
}

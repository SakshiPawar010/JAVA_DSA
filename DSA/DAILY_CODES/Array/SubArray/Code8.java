/*
 * Maximum subarray sum:
 *      Given an integer array of size N.
 *      Find the contiguous subarray (containing atleast one number)which has the largest sum and return its SUBARRAY
 *      Input:[-2,1,-3,4,-1,2,1,-5,4]
 *      Output:[4,-1,2,1]
*/

// return MaxSumSubarray
//Kadane's Algorithm

class MaxSumSubarray{
        public static void main(String[]args){
                int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
              
	      	int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		int start=-1;
		int x=-1;
		int end=-1;

                for(int i=0; i<arr.length; i++){
			if(sum == 0){
				x=i;
			}

			sum = sum + arr[i];

			if(sum>maxSum){
     	              		maxSum = sum;
				start=x;
				end=i;
			}

			if(sum<0){
				sum=0;
			}
		}
                for(int i=start; i<=end; i++){
                	System.out.print(arr[i] + " ");
		}
		System.out.println();
        }
}

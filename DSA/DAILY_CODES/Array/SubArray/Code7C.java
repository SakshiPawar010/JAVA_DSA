/*
 * Maximum subarray sum:
 *      Given an integer array of size N.
 *      Find the contiguous subarray (containing atleast onr number)which has the largest sum and return its sum by PREFIXSUM Approach.
 *      Input:[-2,1,-3,4,-1,2,1,-5,4]
 *      Output:6
*/

// PrefixSum Approach

class PSMaxSubarraySum{
        public static void main(String[]args){
                int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
                int maxSum = Integer.MIN_VALUE;

		int pSArr[] = new int[arr.length];
		pSArr[0]=arr[0];
		for(int i=1; i<arr.length; i++){
			pSArr[i] = pSArr[i-1] + arr[i];
		}

                for(int i=0; i<arr.length; i++){
                        int sum = 0;
                        for(int j=i; j<arr.length; j++){
				if(i==0){
					sum = pSArr[j];
				}else{
                                	sum = pSArr[j]-pSArr[i-1];
				}

                                if(sum>maxSum){
                                        maxSum = sum;
                                }
                        }
                }
                System.out.println(maxSum);
        }
}

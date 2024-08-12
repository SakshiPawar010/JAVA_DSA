/*
 * Given an array if size N.
 * int arr[] = new int[]{2,4,1,3};
 *      B. Print the sum of every single subarray using prefix sum technique
*/

class PsSumOfSubarrays{
	public static void main(String[] args){
		int arr[] = new int[]{2,4,1,3};

		int pSArr[] = new int[arr.length];

		pSArr[0] = arr[0];
		for(int i=1; i<arr.length; i++){
			pSArr[i]=pSArr[i-1]+arr[i];
		}

		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int sum=0;
				if(i==0){
					sum = pSArr[j];
				}else{
					sum = pSArr[j]-pSArr[i-1];
				}
				System.out.println(sum);
			}
		}
	}
}

/*
 * Given an array of size N.
 * Find the total sum of all subarray sum
 * int arr[] = new int[]{1,2,3}
 
 * Output = 20
*/

class SumOfSubarraySum{
	public static void main(String [] args){
		int arr[] = new int[]{1,2,3};
		
		int totalSum=0;
		for(int i=0; i<arr.length; i++){
			int sum =0;
			for(int j=i; j<arr.length; j++){
				sum = sum + arr[j];	
				totalSum = totalSum+sum;
			}
		}
		System.out.println(totalSum);
	}
}

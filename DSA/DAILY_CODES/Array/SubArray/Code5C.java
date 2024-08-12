/*
 * Given an array if size N.
 * int arr[] = new int[]{2,4,1,3};
 *      B. Print the sum of every single subarray using carry forward technique
*/

class CFSumOfSubarrays{
	public static void main(String[]args){
		int arr[] = new int[]{2,4,1,3};

		for(int i=0; i<arr.length; i++){
			int sum=0;
			for(int j=i; j<arr.length; j++){
				sum = sum + arr[j];	
				System.out.println(sum);
			}
		}
	}
}

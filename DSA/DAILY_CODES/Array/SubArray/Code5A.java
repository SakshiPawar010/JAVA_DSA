/*
 * Given an array if size N.
 * int arr[] = new int[]{2,4,1,3};
 * 	A. Print a sum of every single subarray
*/

class SumOfSubarrays{
	public static void main(String [] array){
		int arr[] = new int[]{2,4,1,3};
		
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int sum=0;
				for(int k=i; k<=j; k++){
					sum = sum + arr[k];
				}
				System.out.println(sum);
			}
		}
	}
}

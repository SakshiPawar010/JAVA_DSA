/*Largest element in an array 
 * Given an array A[] of size n.The task is to find the largest element in it.
 	Example 1: 
		Input:  n=5
			A[]={1,8,7,56,90}
		Output: 90
	Example 2: 
		Imput:  n=7
			A[]={1,2,0,3,2,4,5}
		Output: 5
*/

import java.io.*;
class MaxElement{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array: ");
		int n = Integer.parseInt(br.readLine());

		int arr[]=new int[n];
		System.out.println("Enter element in an array : ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Largest element in an array is "+ max);
	}
}

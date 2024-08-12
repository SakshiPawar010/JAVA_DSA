/*Find minimum and maximum element in an array*
 *Given an array A if size N of integers.Your task is to find the minimum and maximum elements in the array 
	Example 1:
		Input:  N=6
			A[]={3,2,1,56,10000,167}
		Output: 1 10000
	Example 2: 
		Input:  N=5
			A[]={1,345,234,21,56789}
		Output: 1 56789
*/

import java.io.*;

class CompareDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array: ");
		int N = Integer.parseInt(br.readLine());     

		int arr[]=new int[N];
		System.out.println("Enter elements in an array : ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Minimum element is : " + min);

		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Maximum element is : " + max);
	}
}

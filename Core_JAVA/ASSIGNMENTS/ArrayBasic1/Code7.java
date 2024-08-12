/*Form largest number from digits

  Given an array of numbers from 0 to 9 of size N. Your task is to rearrange elements of the array such that after combining all the elements of the array, the number formed is maximum.
	Example 1:
		Input:  N = 5
		A[] = {9, 0, 1, 3, 0}
		Output:
			93100
	Example 2:
		Input:  N = 3
			A[] = {1, 2, 3}
		Output:
			321
 */

import java.io.*;

class LargestNum{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array : ");
		int N = Integer.parseInt(br.readLine());

		System.out.println("Enter Elements in an array : ");
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
	}
}

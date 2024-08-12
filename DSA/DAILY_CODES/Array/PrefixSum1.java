/*Arr=[2,5,3,11,7,9,4]
 * Addition(Starting index , Ending index)
*/

import java.io.*;
class ArrAddition{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[]{2,5,3,11,7,9,4};

		System.out.println("Enter starting index :");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter Ending Index :");
		int end = Integer.parseInt(br.readLine());

		int sum = 0;
		for(int i=start; i<=end; i++){
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}
}

//Time Complexity = O(N)
//Space Complexity = O(1)

//************************************


/*Elements in the Range
 * Given an array arr[] containiing positive elements A and B are two numbers defining a range. The task is to check if the array contains all elements in the given range.
 	Example 1: 
		Input:  N=7,A=2,B=5
			arr[]={1,4,5,2,7,8,3}
		Output: Yes
	Example 2:
		Input:  N=7,A=2,B=6
			arr[]={1,4,5,2,7,8,3}
		Output: No
*/

import java.io.*;

class EleRange{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array : ");
		int N = Integer.parseInt(br.readLine());

		int arr[] = new int[N];
		System.out.println("Enter elements in an array : ");
	        for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}	

		System.out.println("Enter elements int the range : ");
		int A =Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		int count=0;

		for(int i=A;i<=B;i++){
			for(int j=0;j<N;j++){
				if(arr[j]==i){
					count++;
				}
			}
		}
		
		if(count== B-A+1){
			System.out.println("Array contains all elements in range "+A+"to"+B);
		}else{
			System.out.println("Array doesn't contains all elements in range "+A+"to"+B);
		}


		/*int x=A;
		while(A<=B){
			for(int i=1; i<arr.length; i++){
			if(arr[i]==A){
				count++;	
			}
			A++;
		}
		}

		if(){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}*/
	}
}

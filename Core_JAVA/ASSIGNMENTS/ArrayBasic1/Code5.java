/*Replace all 0's with 5
 *You are given an integer N. You need to convert all zeros of N to 5
 	Example 1: 
		Input:  N=1004
		Output:	1554
	Example 2: 
		Input:  N=121
		Output: 121	
*/
import java.io.*;
class NumConvert{
        public static void main(String [] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Length of Array : ");
                int length = Integer.parseInt(br.readLine());

		int arr[] =  new int[length];

		System.out.println("Enter element in array : ");

		for(int i=0; i<length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0; i<length; i++){
			if(arr[i]==0){
				arr[i]=5;
			}
			System.out.println(arr[i]);
		}
	
        }
}



/*Search an element iin array
 * Given an integer array and another integer element. The task is to find if the given element is present in the array or not
 * Example 1 :
 	Input:  n=4
		arr[]={1,2,3,4}
		x=3
	Output: 2

 * Example 2 :
 	Inout:  n=5
		arr[]={1,2,3,4,5}
		x=5
	Output: 4
*/
import java.util.*;
import java.io.*;
class Array{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Length of Array : ");
                int length = Integer.parseInt(br.readLine());

                int arr[] = new int[length];

                System.out.println("Enter elements : ");

                for(int i=0; i<length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter element to be searche: ");
		int x = Integer.parseInt(br.readLine());

		for(int i = 0;i<arr.length;i++){
			if(arr[i] == x){
				System.out.println("Element is present at position :" + i);
			}
		}
	}
}




		
		/*for(int i = 0;i<=arr.length;i++){
			if(i==x){
				println(x.lenghth);
			}
		}*/

		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Length of Array : ");
		int length = Integer.parseInt(br.readLine());

		int arr[] = new int[length];

		System.out.println("Enter elements : ");
		
		for(int i=0; i<length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}*/

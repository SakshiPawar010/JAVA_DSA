/*Given an Array of size N and Q number of queries.
 * Query contains two parameters (s,e)
 * s=>starint index , e=>ending index
 * For all queries, print the sum of all elements from index s to index e
 * Arr = [-3,6,2,4,5,2,8,-9,3,1]
 * N = 10
 * Q = 3
 * Queries	s	e	sum
   query1:	1	3	12
   query2:	2	7	12
   query3:	1	1	6
*/

//***Brute Force Approach***

import java.io.*;
class RangeSum{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

		System.out.print("Enter Number of Queries:");
		int Q = Integer.parseInt(br.readLine());

		for(int i=1; i<=Q; i++){
			System.out.print("Enter starting index:");
			int s = Integer.parseInt(br.readLine());

			System.out.print("Enter ending index:");
			int e = Integer.parseInt(br.readLine());

			int sum = 0;

			for(int j=s; j<=e; j++){
				sum = sum + arr[j];
			}
			System.out.println(sum);
		}
	}
}

//Time Complexity = O(Q*N)/O(N)

//***Optimized Approach***
import java.io.*;
class RangeSum{
        public static void main(String [] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

                System.out.print("Enter Number of Queries:");
                int Q = Integer.parseInt(br.readLine());

                for(int i=1; i<=Q; i++){
                        System.out.print("Enter starting index:");
                        int s = Integer.parseInt(br.readLine());

                        System.out.print("Enter ending index:");
                        int e = Integer.parseInt(br.readLine());

                        int sum = 0;

                        for(int j=s; j<=e; j++){
                                sum = sum + arr[j];
                        }
                        System.out.println(sum);
                }
        }
}

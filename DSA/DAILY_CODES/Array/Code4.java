/*Given an array of size N. Reverse array 
 * N = 10/5
 * Time Complexity = O(N)
 * Space complexity = O(N)
*/

class ReverseArray{
	public static void main(String [] args){
		int arr[] = new int[]{5,7,14,9,2};
		int N = 5;

		int arr2[] = new int[N];

		int x=N-1;
		for(int i=0; i<N; i++){
			arr2[i]=arr[x];
			System.out.println(arr2[i]);
			x--;
		}
	}
}

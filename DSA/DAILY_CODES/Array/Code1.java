/*Given an array of size N. Print all the elements.
 * Arr:[5,6,2,3,1,9]
 * N : 6
*/

class ArrayDemo{
	public static void main(String [] args){
		int arr[] = new int[]{5,6,2,3,1,9};
		int N = 6;

		for(int i=0; i<N; i++){
			System.out.println(arr[i]);
		}
	}
}
//Time Complexity = O(N)
//Space Complexity = O(1)

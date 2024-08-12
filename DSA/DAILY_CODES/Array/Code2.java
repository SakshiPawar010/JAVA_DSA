/*Given an array of size N. Count the number of elements having atleast 1 element greater than itself 
 * Arr=[2,5,1,4,8,0,8,1,3,8]
 * N=10
 * Output = 7
*/

/*class GreaterElements{
	public static void main(String[]args){
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
		int N = 10;
		int count = 0;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(arr[i]<arr[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
*/

//Optimization

class GreaterElement{
	public static void main(String[]args){
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int N = 10;
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<N; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		
		int count = 0;
		for(int i=0; i<N; i++){
			if(arr[i]==max){
				count++;
			}
		}

		System.out.println(N-count);		
	}
}

//Time Complexity = O(N)

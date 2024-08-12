

class ArrayDemo1{
	public static void main(String [] args){
		int arr[] = new int[]{5,4,9,3,7};
		int N = 5;

		for(int i=0; i<N; i++){
			for(int j=N-1; j>=0; j--){
				if(i<j){
					System.out.println(arr[i]+arr[j]);
				}else if(i==j){
					System.out.println(arr[i]);
				}
			}
		}
	}
}

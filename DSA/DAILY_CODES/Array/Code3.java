/*Given an array of size N. Return the count of pairs (i,j) with Arr[i]+Arr[j]=K
 * Arr:[3,5,2,1,-3,7,8,15,6,13]
 * N:10
 * K:10
 * Note:- i!=j
 * Output
*/

/*
class PairCount{
	public static void main(String [] args){
		int arr[] = new int[]{3,5,2,1,-3,7,8,15,6,13};
		int N = 10;
		int K = 10;

		int count = 0;

		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(i!=j && arr[i]+arr[j]==K){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
*/

//Or for less iterstions
class PairCount{
        public static void main(String [] args){
                int arr[] = new int[]{3,5,2,1,-3,7,8,15,6,13};
                int N = 10;
                int K = 10;

                int count =0;

                for(int i=0; i<N; i++){
                        for(int j=i+1; j<N; j++){
                                if(i!=j && arr[i]+arr[j]==K){
                                        count++;
                                }
                        }
                }
                System.out.println(count*2);
        }
}


/*Find the shortest subarray containinig both min and max 
 * Arr:[1,2,3,1,3,4,6,4,5,3]
*/

class MinLenSubArray{
	public static void main(String [] args){
		int arr[] = new int[]{1,2,3,1,3,4,6,4,5,3};

		int maxVal=Integer.MIN_VALUE;
		int minVal=Integer.MAX_VALUE;

		for(int i=0; i<arr.length; i++){
			if(arr[i]>maxVal){
				maxVal=arr[i];
			}
			if(arr[i]<minVal){
				minVal=arr[i];
			}
		}

		int len=0;
		int minLen=Integer.MAX_VALUE;

		for(int i=0; i<arr.length; i++){
			if(arr[i]==minVal){
				for(int j=i+1; j<arr.length; j++){
					if(arr[j]==maxVal){
						len=j-i+1;
						minLen=len;
					}
				}				
			}else if(arr[i]==maxVal){
				for(int k=i+1; k<arr.length; k++){
					if(arr[k]==minVal){
						len=k-i+1;
						minLen=len;
					}
				}
			}
		}
		System.out.println(minLen);
	}
}

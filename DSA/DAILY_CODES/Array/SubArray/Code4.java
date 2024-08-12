/*
 * Given an arrayof size N
 * Print all the subarrays
 * int arr[]=new int[]{2,4,1,3}
*/ 

class PrintSubarrays{
	public static void main(String [] args){
		int arr[] = new int[]{2,4,1,3};

		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){	//if we take j=0 after that also answer will be the same
				for(int k=i; k<=j; k++){
					if(k!=j){
						System.out.print(arr[k]+",");
					}else{
						System.out.println(arr[k]);
					}
				}
			}
		}
	}
}

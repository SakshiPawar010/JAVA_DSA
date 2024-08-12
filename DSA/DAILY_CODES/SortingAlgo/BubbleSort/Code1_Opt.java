//Optimization

class BubbleSort2{
	public static void main(String [] args){
		int arr[] = new int[]{2,3,4,5,6,9,7};
		
		boolean swapped;

		for (int i=0; i<arr.length; i++){
			swapped = false;			
			for (int j=0; j<arr.length-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}	
			}
			if(swapped == false)
				return;
		}
	}
}

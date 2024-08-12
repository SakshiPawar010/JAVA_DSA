
class InsertionSort2{
	int i=1;
	void insertionSort(int arr[],int n){
	
		if(i>n)
			return;

		int element = arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>element){
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = element;

		i++;

		insertionSort(arr,n);
	}

	public static void main(String [] args){
		InsertionSort2 obj = new InsertionSort2();

		int arr[] = new int[]{8,3,1,7,5,4,2};
		obj.insertionSort(arr,arr.length);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}

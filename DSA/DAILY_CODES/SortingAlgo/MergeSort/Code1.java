
class MergeSort{
	void mergeSort(int arr[], int start, int end){
		if(start<end){
			int mid = (start + end)/2;
			System.out.println("Start:"+ start + " Mid:" + mid + " End:"+ end);
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
		}
	}
	public static void main (String [] args){
		int arr[] = new int[]{9,1,8,2,7,3,6,4};
		int start = 0;
		int end = arr.length-1;

		MergeSort obj = new MergeSort();
		obj.mergeSort(arr,start,end);

	}
}

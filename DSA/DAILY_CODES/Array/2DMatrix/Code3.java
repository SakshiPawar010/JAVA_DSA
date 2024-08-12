/*
 * Print the row wise sum of entire matrix`
 *
 * 1  2  3  4 = 10
 * 5  6  7  8 = 26
 * 9 10 11 12 = 4f ghjgkl2
*/

class RowMatrixSum{
	public static void main(String [] args){
		int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		for(int i=0; i<arr.length; i++){
			int sum=0;
			for(int j=0; j<arr.length; j++){
				sum = sum + arr[i][j];
			}
			System.out.println(sum);
		}
	}
}

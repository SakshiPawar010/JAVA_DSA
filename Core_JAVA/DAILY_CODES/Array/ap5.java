//Accessing Elements From An Array 
//Using Scanner Class

import java.util.Scanner;
class Ap5Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		int arr[]= new int [5];

		System.out.println("Enter five elements:");
		
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}	

		System.out.println("Data");

		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
	}
}

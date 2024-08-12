//Accessing Elements From An Array

//Using BufferedReader
import java.io.*;
class Ap4Demo{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[]=new int[5];

		System.out.println("Enter five integer numbers");
		//When user taking an input on output screen if user enter other than integer then it gives an run time ERROR of Exception in LANG package "NumberFormatException"

		for(int i=0;i<5;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Data");

		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}

	}
}

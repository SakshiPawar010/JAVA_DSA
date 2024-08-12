''''''''
/*Product of array elements
 * This is a functional problem. Your task is to return the product of array elements under a given modulo
 * The modulo operation finds the remainder after the division of one number by another For example,K(mod(m))=K%m=remainder obtained when K is divided by m
 	
*/
import java.io.*;
class ProductDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array : ");
		int n = Integer.parseInt(br.readLine());

		int arr[]= new int[n];
		System.out.println("Enetr elements in an array : ");
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int product=1;
		for(int i=0; i<arr.length; i++){
			product=product*arr[i];
		}
		System.out.println("Product of all elements in an array is " + product);
	}
}

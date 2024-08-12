
import java.io.*;
class Demo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String: ");

		String str = br.readLine();
		Demo obj = new Demo();
		String str1 = obj.reverse(str);
		System.out.println(str1);
	}

	/*String reverse(String str){
		//String arr[] = new String[str.length];
		char arr[] = str.toCharArray();
		//for(int i=arr.length-1; i>=0; i--){
		int start = 0;
		int end = arr.length-1;
		while(start < end){
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		System.out.println(arr);
	}*/
	String rev(String str){
		if(str.isEmpty())
			return str;
		return rev(str.subString(1)+str.charAt(0));
}

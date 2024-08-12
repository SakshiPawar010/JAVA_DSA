
class ToCharArrayDemo{
	public static void main(String[]args){
		String str1 = "Sakshi";
		char arr[] = str1.toCharArray();

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println(str1.length());

	}
}


class Ap6Demo{
	public static void main(String[]args){
		char arr[] = {'A','B','C'};

		System.out.println(arr);               //ABC
		System.out.println("Array=" + arr);    //when any object come with string then it calles "toString"(arr.toString()) and hence this line gives an address of string 
		System.out.println(arr.toString());    //Returns the address of string
		System.out.println("Array=" + arr.toString());
	}
}

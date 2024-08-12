
class Reverse2Demo{
	public static void main(String[]args){
		String str1 = "Pawar";
		StringBuffer str2 = new StringBuffer(str1);

		//str1 = str2.reverse();
		//ERROR: incompatible types: StringBuffer cannot be converted to String

		str1 = str2.reverse().toString();

		System.out.println(str1);
	}
}

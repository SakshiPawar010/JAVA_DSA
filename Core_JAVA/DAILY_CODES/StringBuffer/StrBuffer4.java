/* Append is a method of StringBuffer class hence it creates a object of StringBuffer
 */
class StrBuffer4Demo{
	public static void main(String[]args){
		String str1 = "Sakshi";
		String str2 = new String("Pawar");
		StringBuffer str3 = new StringBuffer("Shravani");

		//String str4 = str1.append(str3);      [append is not a method  of String it is a method of StringBuffer]
		//ERROR: cannot find symbol
		
		//String str4 = str3.append(str1);
		//ERROR: incompatible types-StringBUffer cannot be converted to string
		//Because when method will be executed then new object of a string buffer will be created
		
	     	StringBuffer str4 = str3.append(str1);          //we append str1 in str3 hence str3 will be changed to ShravaniSakshi
					//new StringBuffer("Sakshi")
					
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}

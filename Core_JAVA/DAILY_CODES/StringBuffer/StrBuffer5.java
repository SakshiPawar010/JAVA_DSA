
class StrBuffer5Demo{
	public static void main(String[]args){
		String str1 = "Sakshi";
		String str2 = new String("Savani");
		StringBuffer str3 = new StringBuffer("Prajakta");

		//String str4 = str1.concat(str3);          
		// ERROR: incompatible types: StringBuffer cannot be converted to String
		// becoz The concat method of String class only contains the parameter of string class not StringBuffer class

		StringBuffer str5 = str3.append(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		//System.out.println(str4);
		System.out.println(str5);
	
	}
}

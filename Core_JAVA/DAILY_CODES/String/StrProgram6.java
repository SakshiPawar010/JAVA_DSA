class StringDemo6{
	public static void main(String[]args){
		String str1 = "Sakshi";
		String str2 = "Pawar";

		String str3 = str1 + str2;             //'+' internally calls the "Append method" of "StringBuilder class" 
		String str4 = str1.concat(str2);       //It is a method of "String Class"
		
		System.out.println(str3);
		System.out.println(str4);

	}
}

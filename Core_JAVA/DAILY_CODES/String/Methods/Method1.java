/*
 * Method: public String concat (String str)
 * Description: -Concatinate string to this string i.e. Another string is concatinated with the first string.
                -Implements new array of character whose length is sum of str1.length and str2.length
 * Parameters: String
 * Return Type: String
*/

class ConcatDemo{
	public static void main (String[]args){
		String str1 = "Sakshi";
		String str2 = "Pawar";
		String str3 = new String("Savani");

		String str4 = str1.concat(str2);
		String str5 = str1.concat(str3);

		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
	}
}

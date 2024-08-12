/*Method: public char charAt (int index);
 *Description: It returns the character located at specified index within the given string
 *Parameters: integer(index)
 *Return Type: character
*/
class CharAtDemo{
	public static void main(String[]args){
		String str1 = "Sakshi";                //length=5

		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(6));   //java.lang.StringIndexOutOfBoundsException

	}
}

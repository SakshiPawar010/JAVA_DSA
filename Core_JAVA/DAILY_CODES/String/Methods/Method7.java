/*
 * Method: public boolean equalsIgnoreCase(String anotherString);
 * Description: Compares a String to this String ignoring case.
 * Parameters: String(str2);
 * Return Type: boolean
*/
class EqualsIgnoreCaseDemo{
	public static void main(String[]args){
		String str1 = "Sakshi";
		String str2 = "SAKSHI";

		System.out.println(str1.equalsIgnoreCase(str2));   //True
	}
}

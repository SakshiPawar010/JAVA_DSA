/*
 * Method: public string replace(char Oldchar,char newChar);
 * Description: Replaces every instance of a character in the given string with a new character
 * Parameters: Character(old character),character(new character)
 * Return type: String
*/
class ReplaceDemo{
	public static void main(String[]args){
		String str1 = "Sakshi";

		System.out.println(str1.replace('h','a'));   //Saksai
		System.out.println(str1.replace('h','A'));

	}
}

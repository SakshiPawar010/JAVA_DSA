/*
 * Method: public int lastIndexOf(int ch, int fromIndex);
 * Description: Finds the last instance of the character in the given string.
 * Parameter: Character(ch to find),Index(index upto the Search)
 * Return type: Integer
*/
class LastIndexOfDemo{
	public static void main(String[]args){
		String str1 = "Sakshi";

		System.out.println(str1.lastIndexOf('s',5));
		System.out.println(str1.lastIndexOf('s',2));    //returns -1
		System.out.println(str1.lastIndexOf('S',5));
	}
}

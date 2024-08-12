/*
 * Method: public int indexOf(char ch,int fromIndex);
 * Description: Finds the first instance of the character in the given string
 * Parameter: Character (ch to find),Integer(index to start the search)
 * Return Type: Integer
*/
class IndexOfDemo{
	public static void main(String[]args){
		String str1 = "Sakshi";                       //It is a case sensitive

		System.out.println(str1.indexOf('h',0));
		System.out.println(str1.indexOf('s',1));
		System.out.println(str1.indexOf('s',4));   //returns -1
		System.out.println(str1.indexOf('S',0));
		System.out.println(str1.indexOf('S',2));   //returns -1
	}
}

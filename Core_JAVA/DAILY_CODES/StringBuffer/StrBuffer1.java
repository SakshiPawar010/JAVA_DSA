/* String Buffer is a mutable(chgange is possible).
 * Methods of String Buffer are synchronized.
 * When we want to do some change in string without creating a new object there we can use String Buffer.
 * There is no change in Address of string when we do some change in the string.
 * StringBuffer str = "Sakshi";   [ERROR:String cannot  be converted to string buffer] 
 * Capacity of string buffer is 16 characters.
 * (current capacity + 1) * 2
*/
class StrBuffer1Demo{
	public static void main(String[]args){
		StringBuffer str1 = new StringBuffer("Sakshi");      
		System.out.println(System.identityHashCode(str1));          //225534817
		
	        str1.append(" Pawar");
		System.out.println(str1);                                  //Sakshi Pawar
		System.out.println(System.identityHashCode(str1));         //225534817
	}
}

/*Method: public int compareTo(String str2);
 *Description: It compares the str1 & str2(case sensitive) if both the strings are equal it returns 0 otherwise returns the comparison
       str1.compareTo(str2)
       -If both are equal = 0 
       -If not equal = defference(returns)
 *Parameters: String (second string)
 *Returns Type: integer
*/
class CompareTo{
	public static void main (String[]args){
		String str1 = "SkKshi";     //ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghij'k'lmnopqrstu'v'wxyz[Here difference between k in Sakshi & v in Savani is 11 Therefore here compareTo method gives -11 answer]
		String str2 = "Savani";     //A=65 , Z=90 , a=97 , z=122 0-9=48-57
		
		//String str3 = "SaKshi";
		//String str4 = "Savani";
		//System.out.println(str3.compareTo(str4));

		System.out.println(str1.compareTo(str2));
	}
}

/*
 *Method: public in compareToIgnoreCase(String str);
 *Description: It compares str1 and str2(case insensitive)
 *Parameters: String
 *Return Type: Integer
*/
class CompareToIgnoreCase{
	public static void main(String[]args){
		String str1 = "SaKshi";
		String str2 = "Savani";

		System.out.println(str1.compareToIgnoreCase(str2));  //It will return -43 in CompareTo method but in CompareToIgnoreCase it returns the -11 which is actual difference ignoring upper and lower case
	}
}

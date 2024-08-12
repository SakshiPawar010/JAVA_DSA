/*
 *Method: public boolean equals(Object anObject);
 *Description: Predict which compares and object to this. This is true only for String with the same character sequence.
 		- Returns true if object is semantically equals to this.
 *Parameters: Object(anObject)
 *Returns Type: boolean
*/
class EqualsDemo{
	public static void main(String[]args){
		String str1 = "Sakshi";
		String str2 = "Savani";
		String str3 = new String ("Sakshi");
		String str4 = "SAKSHI";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
	}
}

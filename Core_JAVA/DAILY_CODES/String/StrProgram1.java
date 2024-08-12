
class StringDemo{
	public static void main(String[]args){
		String str1 = "Core2Web";                //Without using "new"(Store on "SCP" [String Constant Pull] which is Stored on "Heap" )
		String str2 = new String ("Core2Web");   //By using "new"(Stored on Heap [as object] )
		char str3[] = {'c','2','W'};             //By using "Character Array"(Stored on "IntegerCache" of Heap )
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}
}


class StringDemo4{
	public static void main(String[]args){
		String str1 = "Prajakta";              //SCP
		String str2 = "Prajakta";              //SCP(when same string on scp then address of both are same)
		String str3 = new String ("Sakshi");   //Heap
		String str4 = new String ("Sakshi");   //Heap(when two same strings stores on heap each store in new object Hence addresses are different)
		String str5 = new String ("Savani");   //Heap
		String str6 = "Savani";                //SCP

		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));

		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));

		System.out.println(str4);
		System.out.println(System.identityHashCode(str4));

		System.out.println(str5);
		System.out.println(System.identityHashCode(str5));

		System.out.println(str6);
		System.out.println(System.identityHashCode(str6));
	}
}

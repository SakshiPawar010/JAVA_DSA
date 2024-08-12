class StrDemo3{
	public static void main(String[]args){
		String str1 = "SakshiPawar";               //SCP
		String str2 = new String("SakshiPawar");   //Heap

		System.out.println(str1);                 
		System.out.println(System.identityHashCode(str1));
		System.out.println(str2);                
		System.out.println(System.identityHashCode(str2));

		String str3 = "SakshiPawar";               //SCP (same string as str1 Hence both have same address )
		String str4 = new String("SakshiPawar");   //Heap(on Heap every "new" creates new objeat Hence address is different)

		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		System.out.println(str4);
		System.out.println(System.identityHashCode(str4));

	}
}

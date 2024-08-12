
class StringDemo2{
	public static void main(String[]args){
		String str1 = "SakshiPawar";
		String str2 = new String("SakshiPawar");
		char str3[] = {'S','P','2'};

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}

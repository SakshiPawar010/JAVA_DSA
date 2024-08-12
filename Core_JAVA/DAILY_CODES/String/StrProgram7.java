class StringDemo7{
	public static void main(String[]args){
		
		//String str1 = "Sakshi";               //ERROR:variable str1 is already define
		//String str1 = new String("Sakshi");

		String str1=  "Sakshi";                //str1 is already created
		//System.out.println(System.identityHashCode(str1));
		
		str1 = new String("Pawar");            //just changed the data therefore it dosen't gives an error
		//System.out.println(System.identityHashCode(str1));
		
		//str1 = "Savani";
		//System.out.println(System.identityHashCode(str1));

		System.out.println(str1);
		//System.out.println(System.identityHashCode(str1));

	}
}

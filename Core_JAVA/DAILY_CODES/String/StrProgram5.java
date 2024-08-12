
class StringDemo5{
	public static void main(String[]args){
		String str1 = "Sakshi";                       //SCP(String Constant pull)
		String str2 = "Pawar";                        //SCP

		System.out.println(str1+str2);

		String str3 = "SakshiPawar";                  //SCP
		String str4 = str1 + str2;                    //[HEAP] When we poerform any operation on string on run time then call goes to newString abd it stores on Heap
		//String str5 = str1.concat(str2);            (Same as str4)

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//System.out.println(str5);

	}
}

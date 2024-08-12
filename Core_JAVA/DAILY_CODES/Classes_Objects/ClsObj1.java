/* Name of Conctructor and class is same
 * Constructor is used for intialize(to give the space) the Instance Variable
 * Object."<init>" --> Conctructor of object
 * Constructor is a special method without return type
 * invokespecial --> call a parent constructor
 * constructor in inside the object
*/
class ClsObj1Demo{
		int y = 20;

		static void fun(){
			int z = 30;
			System.out.println(z);
		}

		public static void main(String[]args){
			int x = 10;
			System.out.println(x);
			fun();
			//System.out.println(y);
			//ERROR: non-static variable y cannot be referenced from a static context
	}
}

//**********After Compilation**************
/*
  class ClsObj1Demo {
  int y;

  ClsObj1Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        20
       7: putfield      #2                  // Field y:I
      10: return

  static void fun();
    Code:
       0: bipush        30
       2: istore_0
       3: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
       6: iload_0
       7: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
      10: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        10
       2: istore_1
       3: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
       6: iload_1
       7: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
      10: invokestatic  #5                  // Method fun:()V
      13: return
}
*/

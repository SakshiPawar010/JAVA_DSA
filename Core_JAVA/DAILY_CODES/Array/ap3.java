
class Ap3Demo{
	public static void main(String[]args){
		int arr1[]={10,20,30,40,50};         //len=5
		char arr2[]={'A','B','C'};           //3
	        float arr3[]={20.5f,30.5f,40.5f};    //3
		boolean arr4[]={true,false,true};    //3

	      //Integer Array
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);

	      //Character Array
	        System.out.println(arr2[0]);
                System.out.println(arr2[1]);
                System.out.println(arr2[2]);

              //Float Array
	        System.out.println(arr3[0]);
                System.out.println(arr3[1]);
                System.out.println(arr3[2]);
	      //System.out.println(arr3[3]);         //Error:ArrayIndexOutOfBounds(len=3)

	      //Boolean Array
	        System.out.println(arr4[0]);
                System.out.println(arr4[1]);
                System.out.println(arr4[2]);
	}
}

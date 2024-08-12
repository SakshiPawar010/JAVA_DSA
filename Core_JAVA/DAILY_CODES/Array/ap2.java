
class Ap2Demo{
	public static void main(String[]args){
	      
	      //int arr2[]=new int[];                    (array dimension missing)
              
	      //int arr1[]=new int[5]{10,20,30,40,50};   ( array creation with both dimension expression and initialization is illegal)
	      //arr1[0]=10;
	      //arr1[1]=20;
       	      //arr1[2]=30;
		
		
		int arr1[]=new int[]{10,20,30,40,50};      //valid
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		
		int arr2[]=new int[4];                     //valid
                arr2[0]=70;
		arr2[1]=30;
		arr2[2]=40;
		arr2[3]=32;
	      //arr2[4]=45;                               //Error:IndexOutOfBounds
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
	      //System.out.println(arr2[4]);              //Invalid
	}
}



import java.util.HashSet;

class HashSetDemo{
	public static void main(String[]args){
		HashSet hs = new HashSet();
		//java.util.HashSet<String> hs = new java.util.HashSet<>();
		hs.add("Kanha");
		hs.add("Rahul");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");
		hs.add("Ashish");

		System.out.println(hs);
	}
}

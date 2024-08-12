
import java.util.LinkedHashSet;

class LinkedHashSetDemo2{
	public static void main(String [] args){
		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add(10);
		lhs.add(20);
		lhs.add(40);
		lhs.add(10);
		lhs.add(40);

		System.out.println(lhs);
	}
}


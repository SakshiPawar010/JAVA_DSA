// Collections Class

/*ArrayList's output is not in sorted manner
 * if we want a sorted output of ArrayList then we can use either TreeSet and put the list as a parameter or we can use Collections CLASS.
 * TreeSet : when we use TreeSet for Sorting data in ArrayList there is a chances to loose data.
 * Collections CLASS : We can do sortiong without loosing data (duplicate data chalto.).
*/

import java.util.*;

class SortDemo{
	public static void main(String [] args){

		ArrayList al = new ArrayList();

		al.add("Kanha");
		al.add("Ashish");
		al.add("Badhe");
		al.add("Shashi");
		al.add("Rahul");

		System.out.println(al);     //[Kanha, Ashish, Badhe, Shashi, Rahul]

		TreeSet ts = new TreeSet(al);
		System.out.println(ts);     //[Ashish, Badhe, Kanha, Rahul, Shashi]
		
		Collections.sort(al);
		System.out.println(al);     //[Ashish, Badhe, Kanha, Rahul, Shashi]
	}
}

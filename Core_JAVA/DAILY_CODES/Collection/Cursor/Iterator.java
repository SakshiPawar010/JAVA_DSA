import java.util.*;
class IteratorDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("Sakshi");
		al.add("Savani");
		al.add("Prajakta");

		Iterator itr = al.iterator();
		while(itr.hashNext()){
			if("Rahul".equals(its.next()))
				itr.remove();
			System.out.println(itr.next());
		}
		System.out.println(al);
	}
}

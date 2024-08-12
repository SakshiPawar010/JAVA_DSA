
import java.util.LinkedHashSet;

class CricPlayer{
	int jerNo = 0;
	String pName = null;
	CricPlayer(int jerNo,String pName){
		this.jerNo = jerNo;
		this.pName = pName;
	}
	/*public int compareTo(Object obj){
		return 1;
	}
	public String toString(){
		return (jerNo + " " + pName);
	}*/
}

class LinkedHashSetDemo3{
	public static void main(String[]args){
		LinkedHashSet hs = new LinkedHashSet();

		//System.out.println(hs.add(new CricPlayer(7,"MSDhoni")));         //Prints True or False means the element is addes or not to HashSet
		hs.add(new CricPlayer(7,"MSDhoni"));
		hs.add(new CricPlayer(18,"Virat"));
		hs.add(new CricPlayer(45,"Rohit"));
		hs.add(new CricPlayer(7,"MSDhoni"));

		System.out.println(hs);
	}
}


import java.util.TreeSet;

class Movies implements Comparable{
	String movName = null;
	double totColl = 0.0;
	float imdbRating = 0.0f;

	Movies(String movName,double totColl,float imdbRating){
		this.movName = movName;
		this.totColl = totColl;
		this.imdbRating = imdbRating;
	}

	public int compareTo(Object obj){
		return -(movName.compareTo(((Movies)obj).movName));
	}

	public String toString(){
		return movName;
	}
}

class ComparableDemo{
	public static void main(String [] args){
		TreeSet ts = new TreeSet();

		ts.add(new Movies("Gadar",200.00,7.5f));
		ts.add(new Movies("OMG2",100.00,6.5f));
		ts.add(new Movies("DDLJ",300.00,9.5f));
		ts.add(new Movies("OMG2",100.00,6.5f));     //TreeSet is type of SET therefor like a set TreeSet does not accept duplicate data

		System.out.println(ts);
	}
}

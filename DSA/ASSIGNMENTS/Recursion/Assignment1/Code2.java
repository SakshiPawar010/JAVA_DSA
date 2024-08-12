//WAP to display the first 10 natural numbers in reverse order

class NaturalNumPrint{
	void numPrint(int num){
		if(num==0)
			return;
		System.out.println(num);
		numPrint(--num);
	}

	public static void main(String [] args){
		NaturalNumPrint obj = new NaturalNumPrint();
		obj.numPrint(10);
	}
}

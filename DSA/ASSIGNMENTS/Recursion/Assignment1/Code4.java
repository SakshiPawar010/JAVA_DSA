//WAP to print the length of digits in a number

class NumberLen{
	int count=0;
	void numLen(int num){
		if(num==0)
			return;
		count++;
		numLen(num/10);
	}

	public static void main(String[] args){
		NumberLen obj = new NumberLen();
		obj.numLen(121111);
		System.out.println(obj.count);
	}
}

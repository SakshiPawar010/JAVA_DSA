
//WAP to count the occurrence of a specific digit in a given number.

class OccurrenceOfDigit{
	int count=0;
	int digit=2;
	void demo(int num){
		if(num==0)
			return;
		if(num%10==digit)
			count++;
		demo(num/10);
	}

	public static void main(String [] args){
		OccurrenceOfDigit obj = new OccurrenceOfDigit();
		obj.demo(122222);
		System.out.println(obj.count);
	}
}

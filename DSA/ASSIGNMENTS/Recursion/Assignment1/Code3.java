//WAP to print the sum of n natural numbers

class SumPrint{
	int sum=0;
	void printSum(int num){
		if(num==0)
			return;
		sum = sum + num;
		printSum(--num);
		//System.out.println(sum);
	}

	public static void main(String [] args){
		SumPrint obj = new SumPrint();
		obj.printSum(10);
		System.out.println(obj.sum);
	}
}



//WAP to calculate the sum of digits of a given positive integer

class SumOfDigits{
	int sum = 0;
	void digitSum(int num){
		if(num==0)
			return;
		sum = sum + num%10;
		digitSum(num/10);
	}

	public static void main(String [] args){
		SumOfDigits obj = new SumOfDigits();
		obj.digitSum(12345);
		System.out.println(obj.sum);
	}
}

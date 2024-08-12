//WAP to find the factorial of a number

class FactorialOfNum{
	int fact=1;
	void factorial(int num){
		if(num==0)
			return;
		fact = fact*num;
		factorial(--num);
	}

	public static void main(String [] args){
		FactorialOfNum obj = new FactorialOfNum();
		obj.factorial(7);
		System.out.println(obj.fact);
	}
}

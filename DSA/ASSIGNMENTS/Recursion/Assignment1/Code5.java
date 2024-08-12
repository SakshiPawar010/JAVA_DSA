//WAP to check whether the number is prime or not

class PrimeNumber{
	int count=0;
	int x=1;
	void pNum(int num){
		if(x==num)
			return;
		if(num%x==0)
			count++;
		x++;
		pNum(num);	
	}

	public static void main(String [] args){
		PrimeNumber obj = new PrimeNumber();
		obj.pNum(87);
		if(obj.count>2)
			System.out.println("It is not a prime number");
		else
			System.out.println("It is a prime number");
	}
}

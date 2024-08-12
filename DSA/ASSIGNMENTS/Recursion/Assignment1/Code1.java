//WAP to print the numbers between 1 to 10

class NumberPrint{
	//int x=9;
	void numPrint(int num){
		if(num==0)
                	return;
		numPrint(--num);
		System.out.println(++num);
		//num--;
		//x=x-2;
		//numPrint(num);
	}

	public static void main(String [] args){
		NumberPrint obj = new NumberPrint();
		obj.numPrint(10);
	}
}

/*class NumberPrint{
        int x=9;
        void numPrint(int num){
                if(num==0)
                        return;
                //numPrint(num--);
                System.out.println(num-x);
                num--;
                x=x-2;
                numPrint(num);
        }

        public static void main(String [] args){
                NumberPrint obj = new NumberPrint();
                obj.numPrint(10);
        }
}
*/

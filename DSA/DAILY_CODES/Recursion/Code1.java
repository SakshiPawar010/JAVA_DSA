
class NumberPrint{
        void numPrint(int num){
                if(num==0)
                        return;
                System.out.println(num);
                num--;
                numPrint(num);
        }
        public static void main(String [] args){
                NumberPrint obj = new NumberPrint();
                obj.numPrint(10);
        }
}

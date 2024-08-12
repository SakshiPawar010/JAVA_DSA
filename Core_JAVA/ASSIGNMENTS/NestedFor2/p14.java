/*1A 2B 3C
  1A 2B 3C
  1A 2B 3C */
class NestedFor2{
    public static void main(String[]args){
        int n=3;
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n;j++){
                System.out.print(j + ch +" ");
                ch++;
            }System.out.println();
        }
    }
}
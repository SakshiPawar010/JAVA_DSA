/*14 15 16 17
  15 16 17 18
  16 17 18 19
  17 18 19 20
 */
class NestedFor{
    public static void main(String[]args){
        int n=4;
        int num=14;
        for(int i=1;i<=n;i++){
            int num2=num;
            for(int j=1;j<=n;j++){
                System.out.print(num2+" ");
                num2++;
            }System.out.println();
            num++;
        }
    }
}
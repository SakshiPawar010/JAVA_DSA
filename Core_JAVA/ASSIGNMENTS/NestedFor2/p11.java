/*C2W1 C2W2 C2W3
  C2W1 C2W2 C2W3
  C2W1 C2W2 C2W3
 */
class NestedFor2 {
    public static void main(String[]args){
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("C2W"+j+" ");
            }System.out.println();
        }
    }    
}

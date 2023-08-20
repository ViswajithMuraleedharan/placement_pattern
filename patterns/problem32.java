public class problem32 {
    public static void main(String[] args) {
        int n=5;
          int nst=1;
          int val=1;
          
          for(int idx=1; idx<2*n; idx++){
              for(int id=1; id<nst; id++){
                 if(id%2==0){
                     System.out.print("*\t");
                 }
                  else{
                      System.out.print(val+"\t");
                  }
              }
              System.out.println();
              if(idx<n){
                  nst+=2;
                  val++;
              }
              else{
                  nst-=2;
                  val--;
              }
          }
    }
}

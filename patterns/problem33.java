public class problem33 {
    public static void main(String[] args) {
        int n=5;
          for(int idx=n; idx>=1; idx--){
              for(int id=1; id<idx; id++){
                  System.out.print("  ");
              }
              for(int id=idx; id<n; id++){
                  System.out.print(id+" ");
              }
              System.out.print(0+" ");
              for(int id=n-1; id>=idx; id--){
                  System.out.print(id+" ");
              }
              System.out.println();
          }
    }
}

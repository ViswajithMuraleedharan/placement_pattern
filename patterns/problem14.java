public class problem14 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<2*n-1; idx++){
            if(idx<n){
                for(int id=n-idx-1; id>0; id--){
                    System.out.print("   ");
                }
                for(int id=n-idx; id<=n; id++){
                    System.out.print("*  ");
                }
            }
            else{
                for(int id=0; id<=idx-n; id++){
                    System.out.print("   ");
                }
                for(int id=n-1; id>idx-n; id--){
                    System.out.print("*  ");
                }
            }
            
            System.out.println();
        }
    }
}

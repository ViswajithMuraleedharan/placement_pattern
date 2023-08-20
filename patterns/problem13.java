public class problem13 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<2*n; idx++){
            if(idx<n){
                for(int id=0; id<=idx; id++){
                    System.out.print("*  ");
                }
            }
            else{
                for(int id=2*n-idx-1; id>0; id--){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}

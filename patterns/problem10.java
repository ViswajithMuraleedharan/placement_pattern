public class problem10 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=n; idx>0; idx--){
            for(int id=0; id<n-idx; id++){
                System.out.print("    "); 
            }
            for(int id=0; id<2*idx-1; id++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}

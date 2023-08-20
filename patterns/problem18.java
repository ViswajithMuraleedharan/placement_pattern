public class problem18 {
    public static void main(String[] args) {
        int n=7;
        for(int idx=0; idx<n/2;idx++){
            for(int id=0; id<n/2-idx; id++){
                System.out.print("    ");
            }
            for(int id=0; id<2*idx+1; id++){
                System.out.print("*   ");
            }
            System.out.println();
        }
        for(int idx=n/2; idx>=0; idx--){
            for(int id=0; id<n/2-idx; id++){
                System.out.print("    ");
            }
            for(int id=0; id<2*idx+1; id++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}

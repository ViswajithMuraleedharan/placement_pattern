public class problem24 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=1; idx<=n; idx++){
            for(int id=0; id<n-idx; id++){
                System.out.print("    "); 
            }
            for(int id=1; id<2*idx; id++){
                System.out.print(idx+"   ");
            }
            System.out.println();
        }
    }
}

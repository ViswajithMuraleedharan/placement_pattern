public class problem16 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<n; idx++){
            for(int id=0; id<n-idx-1; id++){
                System.out.print("  ");
            }
            for(int jd=n-idx;jd>0; jd--){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int idx=1; idx<n; idx++){
            for(int id=0; id<idx; id++){
                System.out.print("  ");
            }
            for(int jd=idx;jd>=0; jd--){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

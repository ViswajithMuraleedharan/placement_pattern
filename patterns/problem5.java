public class problem5 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<n; idx++){
            for(int id=0; id<idx; id++){
                System.out.print("  ");
            }
            for(int jd=0;jd<n-idx; jd++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

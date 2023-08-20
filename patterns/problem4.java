public class problem4 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<n; idx++){
            for(int id=0; id<n-idx-1; id++){
                System.out.print("  ");
            }
            for(int jd=n-idx-1;jd<n; jd++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

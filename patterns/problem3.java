public class problem3 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<n; idx++){
            for(int id=0; id<n-idx; id++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

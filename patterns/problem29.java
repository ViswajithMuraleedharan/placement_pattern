public class problem29 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<n;idx++){
            for(int id=0; id<n-idx; id++){
                System.out.print("    ");
            }
            System.out.print(idx+1+"   ");
            for(int id=0; id<2*idx-1; id++){
                System.out.print("0   ");
            }
            if(idx!=0){
            System.out.print(idx+1+"   ");
            }
            System.out.println();
        }
    }
}

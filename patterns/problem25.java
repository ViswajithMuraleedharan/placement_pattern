public class problem25 {
    public static void main(String[] args) {
        int n=5;
          int count=1;
        for(int idx=0; idx<n; idx++){
            for(int id=0; id<n-idx-1; id++){
                System.out.print("    "); 
            }
            for(int id=0; id<2*idx+1; id++){
                System.out.print(count+"   ");
                count+=1;
            }
            System.out.println();
        }
    }
}

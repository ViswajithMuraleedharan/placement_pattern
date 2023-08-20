public class problem28 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<n; idx++){
            for(int id=0; id<n-idx-1; id++){
                System.out.print("    ");
            }
            int count=idx+1;
            for(int id=n-idx;id<=n; id++){
                System.out.print(count+"   ");
                count++;
            }
            count-=1;
            for(int id=0; id<idx; id++){
                System.out.print(count-1+"   ");
                count--;
            }
            System.out.println();
        }
    }
}

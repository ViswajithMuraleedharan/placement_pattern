public class problem7 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<n; idx++){
            for(int id=0; id<n; id++){
                if(idx==0 || id==0 || idx==n-1 || id==n-1){
                    System.out.print("*    ");
                }
                else{
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}

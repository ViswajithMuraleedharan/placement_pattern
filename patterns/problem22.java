public class problem22 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=n-1; idx>=0; idx--){
            if(idx==n-1){
               for(int id=0; id<2*n-1; id++){
                    System.out.print("*   ");
                } 
            }
            else{
            for(int id=0; id<=idx; id++){
                System.out.print("*   ");
            }
            for(int id=2*(n-idx-1)-1;id>0; id--){
                System.out.print("    ");
            }
            for(int id=0; id<=idx; id++){
                System.out.print("*   ");
            }
            }
            System.out.println();
        }
    }
}

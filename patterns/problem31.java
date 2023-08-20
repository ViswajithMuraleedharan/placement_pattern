public class problem31 {
    public static void main(String[] args) {
        int n=5;
        for(int idx=0; idx<n;idx++){
            for(int id=n; id>0; id--){
                if(id==idx+1){
                    System.out.print("*   ");
                }
                else{
                    System.out.print(id+"   ");
                }
            }
            System.out.println();
        }
    }
}

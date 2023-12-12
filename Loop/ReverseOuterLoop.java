package Loop;
public class ReverseOuterLoop {
    public static void main(String[] args) {
        for(int i=9;i>=1;i-=2){
            for(int j=1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

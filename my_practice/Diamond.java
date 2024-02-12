public class Diamond {
    public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                for(int k=4;k>=1;k--){
                    System.out.print(" ");
                }
                for(int j=i;j<i*2;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}

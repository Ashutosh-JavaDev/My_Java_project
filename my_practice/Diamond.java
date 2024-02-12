public class Diamond {
    public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                for(int k=4;k>=i;k--){
                    System.out.print(" ");
                }
                for(int j=1;j<i*2;j++){
                    if(i+j%2==0){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}

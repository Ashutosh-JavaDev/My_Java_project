package alphabet;
import java.util.*;
public class om_namah_shivay {
    /*letter o */
    public static void o(int size){
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if((i==1&&j==3)||(i==5&&j==3)||(j==2&&(i!=1&&i!=5))||j==4&&(i!=1&&i!=5)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*Letter m */
    public static void m(int size){
         for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if((j==1)||(i==2&&j==3)||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*letter n */
    public static  void n(int size){
         for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(j==1||j==5||(i==2&&j==2)||(i==3&&j==3)||(i==4&&j==4)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*Letter A */
    public static void a(int size){
     for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if((i==1&&j==3)||(i!=1&&j==2)||(j==4&&i!=1)||(j==3&&(i==1||i==3))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void h(int size){
         for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(j==1||j==5||i==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*letter s */
    public static void s(int size){
         for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if((i==1&&j!=1)||(i==3&&(j!=1&&j!=5))||(i==5&&j!=5)||(i==2&&j==1)||(i==4&&j==5)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*Letter I */
    public static void i(int size){
         for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(i==1||i==5||j==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*Letter v */
    public static void v(int size){
         for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if((i==2&&j==1)||(j==2&&(i==3||i==4))||(i==5&&j==3)||j==4&&(i==3||i==4)||(i==2&&j==5)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*Letter y */
    public static void y(int size){
         for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
              if(j==3&&(i!=1&&i!=2)||(i==2&&(j==2||j==4))||(i==1&&(j==1||j==5))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Om Namah Shivaay");
        int size=5;
        System.out.println();
        o(size);
        System.out.println();
        m(size);
        System.out.println();
        n(size);
        System.out.println();
        a(size);
        System.err.println();
        m(size);    
        System.out.println();
        a(size);    
        System.out.println();
        h(size);
        System.out.println();
        s(size);
        System.out.println();
        i(size);
        System.out.println();
        v(size);
        System.out.println();
        a(size);
        System.out.println();
        a(size);
        System.out.println();
        y(size);
    }
}

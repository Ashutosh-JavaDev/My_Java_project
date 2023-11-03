import java.util.*;
public class WithoutbuiltinLength {
    public static  int lambai(String str){
        int c=0;
        for(int i=0;i<str.length();i++){
            c++;
        }
        return c;
    }
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thee  Senetence");
        String str=sc.nextLine();
        int check= lambai(str);
        System.out.println("Output: "+check);
    }
        
}

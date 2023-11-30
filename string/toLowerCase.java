import java.util.*;
public class toLowerCase {
    public static String result(String str){
        String Output=str.toLowerCase();
        return Output;
    }    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str=sc.nextLine();

        String output=result(str);
        System.out.println("Output:     "+output);
    }
}

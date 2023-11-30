import java.util.*;
public class replaceWithName {
    public static String result(String str,String rep,String replace){
        String output=str.replace(rep, replace);
        return output;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the original Sentence");
        String str=sc.nextLine();
        System.out.println("Enter the Word Wants to replace");
        String rep=sc.nextLine();
        System.out.println("Enter the Sentence with the Original String wants to replace");
        String replace=sc.nextLine();
        String Output=result(str,rep, replace);
        System.out.println("String After Replace: "+Output);
    }
}

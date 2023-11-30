import java.util.*;
 public class SpecifiedCharacterSequence {
    public static void Result(String str,String seq){
        if(str.contains(seq)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence for your String");
        String str=sc.nextLine();
        System.out.println("Enter the Word wants to check in the string");
        String seq=sc.nextLine();
        Result(str, seq);
    }
}

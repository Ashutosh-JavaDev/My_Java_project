import java.util.Scanner;
class replaceUnderscore{
    void checkDisp(String str){
        String newString=str.replace(" ", "_");
    }    
}
public class underScoreSpace {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    replaceUnderscore ob=new replaceUnderscore();
    System.out.println("Pass Sentence");
    ob.checkDisp(sc.nextLine());
 }   
}

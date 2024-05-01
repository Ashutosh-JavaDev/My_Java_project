import java.util.Scanner;
class palin{
    boolean check(String str){
        boolean result=true;
        String st="";
        for(int i=str.length();i<=0;i--){
            char ch=str.charAt(i);
            st+=ch;
        }
        if(str.equals(st)){
            result=true;
        }
        else{
            result=false;
        }
        return result;
    }
}
public class Palindrome {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    palin ob=new palin();
    boolean res=ob.check(str);
    System.out.println("Result: "+res);

    }
}

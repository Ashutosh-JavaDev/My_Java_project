import java.util.Scanner;
class Alin{
    boolean check(String str){
        boolean result=true;
        String st="";
        for(int i=str.length()-1;i<=0;i--){
            char ch=str.charAt(i);
            st+=ch;
        }
        System.out.println(st);
        if(str.equals(st)){
            result=true;
        }
        else{
            result=false;
        }
        return result;
    }
}
public class alin {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    Alin ob=new Alin();
    boolean res=ob.check(str);
    System.out.println("Result: "+res);

    }
}

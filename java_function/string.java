package  java_function;
import java.util.*;
public class string{
    public static int length(String n){
        int le=n.length();
        return le;
    }
    public static String tolowercase(String n){
        String lc=n.toLowerCase();
        return lc;
    }
    public static String toUppercase(String n){
        String uc=n.toUpperCase();
        return uc;
    }
    public static String trim(String n){
        String tr=n.trim();
        return tr;
    }
    public static  String replace(String n){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String want to replace");
        String pl=sc.nextLine();
        System.out.println("Enter the string with the value wants to replace");
        String po=sc.nextLine();
        String re=n.replace(pl,po);
        return re;
    }
    public static char getcharacter(String n){
        Scanner sc=new Scanner(System.in){
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String name=sc.nextLine();
        int l=length(name);
        System.out.println("The length of the String is      :"+l);
        String tl=tolowercase(name);
        System.out.println("The string in lowercase          :"+tl);
        String up=toUppercase(name);
        System.out.println("The String in upper case         :"+up);
        String tri=trim(name);
        System.out.println("The String after trim            :"+tri);
        String rep=replace(name);
        System.out.println("The String after replace         :"+rep);
    }


}
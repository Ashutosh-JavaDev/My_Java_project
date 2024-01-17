import java.util.Scanner;
class subStr{
    void stringCheck(String str){
        int c=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='h' && str.charAt(i+1)=='i' && str.charAt(i+2)==' '){
            c++;
           }
        }
        System.out.println("Total hi in the String: "+c);
    }
}
public class subStringJava {
    public static void main(String[]args){
        subStr ob=new subStr();
        ob.stringCheck("Hi Everyone how hi are hi this you his");
    }
}

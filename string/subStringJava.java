import java.util.Scanner;
class subStr{
    void stringCheck(String str){
        String newStr=str.substring(3);
        System.out.println(newStr);
    }
}
public class subStringJava {
    public static void main(String[]args){
        subStr ob=new subStr();
        ob.stringCheck("Hii Everyone");
    }
}

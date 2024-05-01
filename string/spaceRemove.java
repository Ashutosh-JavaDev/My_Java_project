import java.util.Scanner;
class remSpace{
    void sapceRem(String str){
        String st=str.trim();
        System.out.println(st);
    }
}
public class spaceRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        remSpace ob=new remSpace();
        System.out.println("Enter the String");
        String str=sc.nextLine();
        ob.sapceRem(str);
    }
}

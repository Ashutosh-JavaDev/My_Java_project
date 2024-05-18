import java.util.Scanner;
class EndsWith{
    public boolean check(String str, String st){
        boolean result=false;
        if(str.endsWith(st)){
            result=true;
        }
        return result;
    }
}
public class endsWith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter the String want to check");
        String st=sc.nextLine();
        EndsWith ob=new EndsWith();
        boolean res=ob.check(str, st);
        System.out.println("Result: "+res);
    }
}

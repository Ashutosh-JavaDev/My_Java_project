import java.util.*;
public  class replaceSpaceWithUnderscore{
    public static String result(String str){
        String output=str.replace(" ","_");
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String Str=sc.nextLine();
        String Output=result(Str);
        System.out.println("Result:     "+Output);
    }
}
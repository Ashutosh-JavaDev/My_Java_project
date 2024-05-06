import java.util.Scanner;
class lonngwrd{
    public static String check(String str){
        String longest="";
        String shortest="";
        int max=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                shortest+=ch;
            }
            else{
                if(shortest.length()>max){
                    max=shortest.length();
                    longest=shortest;
                }
            }
            shortest=" ";
        }
        if(shortest.length()>max){
            longest=shortest;
        }
        return longest;
    }
}
public class LongWord {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the String");
         String str=sc.nextLine();
         lonngwrd ob=new lonngwrd();
         String res=ob.check(str);
         System.out.println("Longest Word: "+res);

    }
}

import java.util.Scanner;
class Vowel{
    String Str;
    int get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u")){
                count++;
            }
        }
    }
}public class CountVowel {
    
}

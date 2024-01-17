import java.util.Scanner;
class vowelCheck{
    void disp(String str){
        System.out.println("Deleted Vowel");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='o' ||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='u'){
                char ch=str.charAt(i);
                System.out.println(ch);
            }
        }
    }    
}
public class deleteAllVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        vowelCheck ob=new vowelCheck();
        ob.disp("apple");

    }
}

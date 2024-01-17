import java.util.Scanner;
class numTochar{
    void disp(String num){
        String st1=" ";
        char ch;
       for(int i=0;i<num.length();i++){
        ch=num.charAt(i);
        switch(ch){
            case '1':
            st1+="One"+" ";
            break;
            case '2':
            st1+="Two"+" ";
            break;
            case '3':
            st1+="Three"+" ";
            break;
            case '4':
            st1+="Four"+" ";
            break;
            case '5':
            st1+="Five"+" ";
            break;
            case '6':
            st1+="Six"+" ";
            break;
            case '7':
            st1+="Seven"+" ";
            break;
            case '8':
            st1+="Eight"+" ";
            break;
            case '9':
            st1+="Nine"+" ";
            break;
            default:
            System.out.println("Invalid Press");
            break;
        }
       }
       System.out.println("In String :"+st1);
    }
}
public class numberToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press Number");
        numTochar ob=new numTochar();
        ob.disp(sc.nextLine());
    }
}

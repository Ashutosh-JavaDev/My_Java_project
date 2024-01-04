import java.util.Scanner;

class StringInput {
    String str;
    char ch;

    void TakingInput(String str) {
        this.str = str;
    }

    String TakeInput() {
        return str;
    }

    int Count(){
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                c++;
            }
        }
        return c;
    }
}

public class CountSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        StringInput ob = new StringInput();
        ob.TakingInput(sc.nextLine());
        int result=ob.Count();
        System.out.println("Result: "+result);
        
    }
}

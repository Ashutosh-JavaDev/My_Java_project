import java.util.Scanner;

class count {
    String str;

    void get(String str) {
        this.str = str;
    }

    String set() {
        return str;
    }
    int output(){
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                c++;
            }
        }
        return c;
    }
}

public class CountWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        count ob=new count();
        ob.get(sc.nextLine());
        int result=ob.output();
        System.out.println("No. of  Words: "+(result+1));

    }
}

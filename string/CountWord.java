import java.util.Scanner;

class count {
    String str;

    void get(String str) {
        this.str = str;
    }

    String set() {
        return str;
    }
    void output(){
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                c++;
            }
        }
    }
}

public class CountWord {

}

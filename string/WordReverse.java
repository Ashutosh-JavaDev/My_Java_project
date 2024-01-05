import java.util.Scanner;

class wordReverse {
    String str,st="";
    char ch;

    void wordRev() {
        for (int i = str.length()-1; i >=0; i--) {
            if(str.charAt(i)!=' '){
                st=st+str.charAt(i);
            }
        }
    }
}

public class WordReverse {

}

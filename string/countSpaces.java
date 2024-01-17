import java.util.Scanner;

class spacesCount {
    void splitsSpaces(String str){
        int c=1;
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
               if(ch[i].equals('') && ch[i+1]!=' '){
                c++;
               }       
            
        }
        System.out.println("Count of Words: "+c);

    }
}

public class countSpaces {

}

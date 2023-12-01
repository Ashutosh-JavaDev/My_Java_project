package Practice_java;
import java.util.*;

public class UpperOrLower {
  public static void Casecheck(char character){
    if (character >= 'A' && character <= 'Z') {
        System.out.println("Character is Uppercase");
    }
    else if (character >= 'a' && character <= 'z') {
        System.out.println("Character is Lowercase");
    }
    else {
        System.out.println("Character is neither Uppercase nor Lowercase");
    }
  }  

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Character");
    char ch = sc.next().charAt(0);
    Casecheck(ch);
  }
}

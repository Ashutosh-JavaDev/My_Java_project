import java.util.*;
public class SumOfDigits{
    public static int PrintSum(int Start,int end){
       if(Start>end){
        return 0;
       } 
       else{
        return Start+PrintSum(Start+1,end);
       }
    }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Starting of the Array");
    int  Start=sc.nextInt();
    System.out.println("Enter the ending Position");
    int end=sc.nextInt();
    System.out.println("Enter the  value in the Array");
    int output=PrintSum(Start, end);
    System.out.println("Answer: "+output);
  }
}
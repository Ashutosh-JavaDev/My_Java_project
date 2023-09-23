import java.util.*;
class check{
    int n;
    public void result(){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is  not Prime");
        }
    }
}
public class Prime_Number {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    check krishna=new check();
    System.out.println("Enter the Number");
    int n=sc.nextInt();
    krishna.n=n;
    krishna.result();

   } 
}

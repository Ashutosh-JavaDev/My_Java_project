import java.util.Scanner;

public class swastik {

    public static void print_swastik(int n) {
		int mid=n/2+1;
      for(int i=1;i<=n;i++){
		  for(int j=1;j<=n;j++){
			  if(i==mid||j==mid||(j==1&&i<=mid)||(i==1&&j>=mid)||(i==n&&j<=mid)||(j==n&&i>=mid))
			  {
				  System.out.print("* ");
			  }
			  else{
				  System.out.print("  ");
			  }
		  }
		  System.out.println();
	  }
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the size of the pattern");
		int n=sc.nextInt();
        print_swastik(n);
    }
}

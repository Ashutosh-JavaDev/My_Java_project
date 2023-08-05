import java.util.*;

public class myname {

    // Pattern A
    public static void printA(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = m; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                if (k == 1 || k == (i * 2 - 1) || i == (m / 2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		System.out.println();
    }

    // Pattern Y
     public static void printY(int n) {
      for(int i=1;i<=n;i++){
		  for(int k=1;k<=n-2;k++){
			  System.out.print(" ");
		  }
		  for(int j=1;j<=n;j++){
			  if(i==j&&(i<(n/2)+1)||i+j==(n+1)&&(i<(n/2)+1)||j==(n/2)+1&&i>(n/2))
			  {
				  System.out.print("*");
			  }
			  else{
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
    }

    // Pattern U
    public static void printU(int h) {
        for (int i = 1; i <= h; i++) {
			  for(int k=1;k<=h-2;k++){
			  System.out.print(" ");
		  }
            for (int j = 1; j <= h; j++) {
                if (j == 1 && i < h || j == h && i < h || i == h && (j > 1 && j < h)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		System.out.println();
    }

    // Pattern S
    public static void printS(int s) {
        for (int i = 1; i <= s; i++) {
			  for(int k=1;k<=s-2;k++){
			  System.out.print(" ");
		  }
            for (int j = 1; j <= s; j++) {
                if (i == 1 || i == s || i == (s / 2) + 1 || j == 1 && i <= (s / 2) || j == s && i > (s / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		System.out.println();
    }

    // Pattern H
    public static void printH(int u) {
        for (int i = 1; i <= u; i++) {
			  for(int k=1;k<=u-2;k++){
			  System.out.print(" ");
		  }
            for (int j = 1; j <= u; j++) {
                if (j == 1 || j == u || i == (u / 2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern A, Y, U, S, H");
        int size = sc.nextInt();

        printA(size);
        printY(size);
        printU(size);
        printS(size);
        printH(size);
    }
}

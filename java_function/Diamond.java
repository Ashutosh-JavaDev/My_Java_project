import java.util.*;

public class Diamond {
	
	public static void diamondpattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k++) {
				if (k == 1 || k == (i * 2 - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k++) {
				if (k == 1 || k == (i * 2 - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of loop");
		int n = sc.nextInt();
		System.out.println("Enter the row");
		int s = sc.nextInt();		
		for (int c = 1; c <= s; c++) {
				diamondpattern(n);
			}
	}
}

import java.util.Scanner;

public class ProductMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int arr3[][] = new int[3][3];
        System.out.println("Enter First matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Product");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    p = p + arr1[i][k] * arr2[k][j];
                }
                arr3[i][j]=p;
                p=0;
            }
        }
        System.out.println("Product of Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}

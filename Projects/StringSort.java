import java.util.Scanner;
public class StringSort {
    public static void StringSo(String str[], int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println("Array After Sort: ");
        for(int i=0;i<size;i++){
            System.out.println(str[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of the String");
        int size=sc.nextInt();
        sc.nextLine();
        String str[]=new String[size];
        System.out.println("Enter the String");
        for(int i=0;i<size;i++){
            str[i]=sc.nextLine();
        }
        StringSo(str, size);
    }
}

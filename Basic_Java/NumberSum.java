package Basic_Java;

import java.util.*;

public class NumberSum {
    public static int result(int arr[], int size) {
        int answer = 0;
        for (int i = 0; i < size; i++) {
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of  the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Number wants to add");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int Output=result(arr, size);
        System.out.println("Answer:     "+Output);
    }
}

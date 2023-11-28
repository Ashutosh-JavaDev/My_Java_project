// Write a Java program to check if an array of integers is without 0 and -1.
package Basic_Java.BufferInput;

import java.io.*;

public class ExceptZeroOrOne {
    public static boolean except(int arr[], int size) {
        for(int i=0;i<size;i++){
            if(arr[i]==-1||arr[i]==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(read);
        System.out.println("Enter the size of the array");
        int size = Integer.parseInt(sc.readLine());
        int arr[] = new int[size];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(sc.readLine());
        }
      if(except(arr, size)){
        System.out.println("Array Contains -1 or 0");
      }
      else{
        System.out.println("Array Not Contains -1 or 0");
      }
    }
}

package Basic_Java.BufferInput;

import java.io.*;

public class BuffRead {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(read);
        System.out.println("Enter Roll Number");
        int roll = Integer.parseInt(sc.readLine());
        System.out.println("Enter Name");
        String Name = sc.readLine();
        System.out.println("Enter Fee");
        Double Fee = Double.parseDouble(sc.readLine());
        System.out.println("Enter the Grade");
        char grade = sc.readLine().charAt(0);
        System.out.println("Enter Percentage");
        Float per = Float.parseFloat(sc.readLine());
        // Print All The Value
        System.out.println("Name    : "+Name);
        System.out.println("Roll     : "+roll);
        System.out.println("Fee : "+Fee);
        System.out.println("Percentage  : "+per);
        System.out.println("Grade   : "+grade);
    }
}

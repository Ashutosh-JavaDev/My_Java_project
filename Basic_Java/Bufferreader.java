package Basic_Java;

import java.io.*;

public class Bufferreader {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(read);
        System.out.println("Enter Roll Number");
        int roll = Integer.parseInt(sc.readLine());
        System.out.println("Enter Name");
        String Name = sc.readLine();
        System.out.println("Enter Feee");
        Double Fee = Double.parseDouble(sc.readLine());
        System.out.println("Enter the Grade");
        char grade = (char) sc.read();
        System.out.println("Enter Percentage");
        Float per = Float.parseFloat(sc.readLine());

    }
}

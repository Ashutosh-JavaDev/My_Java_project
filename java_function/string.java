package java_function;

import java.util.Scanner;

public class string{
    
    // Function to calculate the length of the string
    public static int (String str) {
        return str.length();
    }
    
    // Function to convert the string to lowercase
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }
    
    // Function to convert the string to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
    
    // Function to remove leading and trailing spaces from the string
    public static String trim(String str) {
        return str.trim();
    }
    
    // Function to replace a substring in the string
    public static String replace(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the old string to replace: ");
        String oldStr = sc.nextLine();
        System.out.println("Enter the new string: ");
        String newStr = sc.nextLine();
        String replacedStr = str.replace(oldStr, newStr);
        return replacedStr;
    }
    
    // Function to get a substring from the string
    public static String substring(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting index: ");
        int startIndex = sc.nextInt();
        System.out.println("Enter the ending index: ");
        int endIndex = sc.nextInt();
        String subStr = str.substring(startIndex, endIndex);
        return subStr;
    }
    
    // Function to get a character at a specific index in the string
    public static char getCharacter(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index position of the character: ");
        int index = sc.nextInt();
        char character = str.charAt(index);
        return character;
    }
    
    // Function to check if the string starts with a specific substring
    public static boolean startsWith(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the substring to check if the string starts with: ");
        String substring = sc.nextLine();
        boolean startsWithSubstr = str.startsWith(substring);
        return startsWithSubstr;
    }
    
    // Function to check if the string ends with a specific substring
    public static boolean endsWith(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the substring to check if the string ends with: ");
        String substring = sc.nextLine();
        boolean endsWithSubstr = str.endsWith(substring);
        return endsWithSubstr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputString = sc.nextLine();
        
        // Perform various string operations
        
        // Calculate and display the length of the string
        int length = length(inputString);
        System.out.println("The length of the string is: " + length);
        
        // Convert the string to lowercase and display it
        String lowercaseString = toLowerCase(inputString);
        System.out.println("The string in lowercase: " + lowercaseString);
        
        // Convert the string to uppercase and display it
        String uppercaseString = toUpperCase(inputString);
        System.out.println("The string in uppercase: " + uppercaseString);
        
        // Remove leading and trailing spaces from the string and display it
        String trimmedString = trim(inputString);
        System.out.println("The string after trim: " + trimmedString);
        
        // Replace a substring in the string and display it
        String replacedString = replace(inputString);
        System.out.println("The string after replace: " + replacedString);
        
        // Get a substring from the string and display it
        String subString = substring(inputString);
        System.out.println("The substring of the string is: " + subString);
        
        // Get a character at a specific index in the string and display it
        char character = getCharacter(inputString);
        System.out.println("The character at the specified index is: " + character);
        
        // Check if the string starts with a specific substring and display the result
        boolean startsWithSubstr = startsWith(inputString);
        System.out.println("Does the string start with the specified substring? " + startsWithSubstr);
        
        // Check if the string ends with a specific substring and display the result
        boolean endsWithSubstr = endsWith(inputString);
        System.out.println("Does the string end with the specified substring? " + endsWithSubstr);
    }
}

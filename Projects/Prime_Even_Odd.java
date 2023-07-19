import java.util.*;

public class Prime_Even_Odd {
    // Function to check if a number is prime using Sieve of Eratosthenes
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to check and print even, odd, and prime numbers from an array
    public static void check_numbers(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Input array elements
        }

        System.out.println("Press 1: to check all even numbers");
        System.out.println("Press 2: to check all odd numbers");
        System.out.println("Press 3: to check all prime numbers");
        System.out.println("Press 4: to display even and odd numbers");
        System.out.println("Press 5: to display even and prime numbers");
        System.out.println("Press 6: to display odd and prime numbers");

        int order = sc.nextInt();
        switch (order) {
            case 1:
                // Print all even numbers in the array
                System.out.print("The even numbers in the array: ");
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
                break;

            case 2:
                // Print all odd numbers in the array
                System.out.print("The odd numbers in the array: ");
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 != 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
                break;

            case 3:
                // Print all prime numbers in the array
                System.out.print("The prime numbers in the array: ");
                for (int i = 0; i < n; i++) {
                    if (isPrime(arr[i])) {
                        System.out.print(arr[i] + " ");
                    }
                }
                break;

            case 4:
                // Print both even and odd numbers in the array
                System.out.print("The even numbers in the array: ");
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.print("\nThe odd numbers in the array: ");
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 != 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
                break;

            case 5:
                // Print both even and prime numbers in the array
                System.out.print("The even numbers in the array: ");
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.print("\nThe prime numbers in the array: ");
                for (int i = 0; i < n; i++) {
                    if (isPrime(arr[i])) {
                        System.out.print(arr[i] + " ");
                    }
                }
                break;

            case 6:
                // Print both odd and prime numbers in the array
                System.out.print("The odd numbers in the array: ");
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 != 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.print("\nThe prime numbers in the array: ");
                for (int i = 0; i < n; i++) {
                    if (isPrime(arr[i])) {
                        System.out.print(arr[i] + " ");
                    }
                }
                break;

            default:
                System.out.println("Invalid Input\nPress a valid input");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want to check the array?");
        int s = sc.nextInt();
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println("\n" + (i + 1) + " array elements:");
            int arr1[] = new int[size];
            check_numbers(arr1, size);
        }
    }
}

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Fibonacci Series");

        Scanner s = new Scanner(System.in);

        int n = 0;

        while (true) {

            System.out.print("Enter the number of terms: ");
            n = s.nextInt();

            if (n > 0) {
                break;
            } else {
                System.out.println("Please enter a valid number.");
            }
        }

        printFibonacci(n);

        s.close();
    }

    public static void printFibonacci(int n) {

        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
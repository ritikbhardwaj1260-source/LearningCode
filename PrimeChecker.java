import java.util.Scanner;
public class PrimeChecker {
    public static void main (String[] args){

        Scanner s= new Scanner(System.in);
        //Checking whether is A Prime or not//

        while (true){
            System.out.print("Enter any Positive number:");
            int num1 = s.nextInt();
            if (num1 <= 0) {
                System.out.println("Number less than or equal to Zero never Prime");
                break;
            } else if (num1 == 1) {
                System.out.println("1 is a Whole and Natural Number ");
            }
            else {
                boolean isPrime = true;


                for (int i = 2; i <= num1 / 2; i++) {
                    if (num1 % i == 0) {
                        isPrime = false;
                        break; //
                    }
                }
                // Result print
                if (isPrime) {
                    System.out.println("The Entered number (" + num1 + ") is Prime!");
                } else {
                    System.out.println("The Entered number (" + num1 + ") is NOT Prime.");
                }
            }

            }
        }
    }


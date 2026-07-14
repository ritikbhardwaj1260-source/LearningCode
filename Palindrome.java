import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter any string of char: ");
            String str = s.nextLine().toLowerCase();
            
            
            int left = 0;
            int right = str.length() - 1;
            boolean palindrome = true;
            
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    palindrome = false;
                    break;
                }
                left++;
                right--;
            }   
            
            
            if (palindrome) {
                System.out.println("Entered String is a palindrome");
            } else {
                System.out.println("Entered String is not a palindrome");
            }
            
        } finally {
            s.close();
            System.out.println("Scanner closed");
        }
    }   
}
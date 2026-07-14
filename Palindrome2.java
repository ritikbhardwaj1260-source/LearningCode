import java.util.Scanner;
public class Palindrome2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();
       
        if (checkPalindrome(num))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome :");
    
    sc.close();
    }
    public static boolean checkPalindrome(int num){
        String original = String.valueOf(num);
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        return original.equals(sb.toString());
    }
}

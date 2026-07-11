import java.util.Scanner;
public class SwappingNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1 = 20;
        int num2 = 50;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " +num2);
    }
}

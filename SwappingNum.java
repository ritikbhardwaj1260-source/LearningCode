import java.util.Scanner;

public class SwappingNum{
    public static void main(String[] args){

    Scanner s = new Scanner(System.in);


    System.out.println("Enter the first number :");
    int a = s.nextInt();

    System.out.println("Enter the second number :");
    int b = s.nextInt();

    System.out.println("Before swapping number print :");
    System.out.println("a = " +  a);
    System.out.println("b = " +  b);


    Swap(a, b);
}
static void Swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping number print :");
    System.out.println("a =" +a);
    System.out.println("b =" +b);
}





}


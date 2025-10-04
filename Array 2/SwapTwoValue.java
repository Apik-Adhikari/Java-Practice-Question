import java.util.Scanner;

public class SwapTwoValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("First number: " + a );
        System.out.println("Second number: " + b );

        int temp;

        temp = a;
        a = b;
        b = temp; 

        System.out.println("After Swapping");
        System.out.println("First number: " + a );
        System.out.println("Second number: " + b );

        sc.close();
    }
}
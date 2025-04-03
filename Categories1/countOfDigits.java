import java.util.Scanner;

public class countOfDigits {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        while (n!=0) {
            n=n/10;
            c++;
        }

        System.out.println("The number of digits in the number is "+ c);
        sc.close();
        }
}

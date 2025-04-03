import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        while (n>0) {
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("The sum of the digits of the number is "+ sum);
        sc.close();
    }
}

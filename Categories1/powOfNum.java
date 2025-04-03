import java.util.Scanner;

public class powOfNum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the power");
        int p = sc.nextInt();
        int ans = 1;
        // int pow = 1;

        // int pow = (int)Math.pow(n,p);
        // System.out.println("The power of the number is "+ pow);

        // using loop
        for(int i=1;i<=p;i++){
            ans = ans*n;
        }
        System.out.println("The power of the number is "+ ans);
        sc.close();
    }
    
}

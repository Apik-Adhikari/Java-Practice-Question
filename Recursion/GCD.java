import java.util.Scanner;

public class GCD {

    // Recursive function to return gcd of a and b
    static int iGCD(int x, int y){
        while( x%y != 0 ){
            int rem = y;
            y = x % y;
            x = rem;
        }
        return y;
    }

    // Euclid's algorithm
    static int gcd(int x, int y){
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();   
        System.out.println(iGCD(x, y));
        System.out.println(gcd(x, y));
        System.out.println(lcm(x, y));
        sc.close();
    }             
}

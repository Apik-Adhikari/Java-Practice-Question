import java.util.Scanner;

public class printDecreasing {
    static void printDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        printDecreasing(n);
        sc.close();
    }
} 

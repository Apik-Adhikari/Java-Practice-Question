import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==0)
                sum = sum - i;
            else
                sum = sum + i;
        }
        System.out.println("The sum of the series is "+ sum);
        sc.close();
    }
}

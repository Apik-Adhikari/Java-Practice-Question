import java.util.Scanner;

public class PrefixSum {

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for(int i = 1; i < n; i++){
            pref[i] = pref[i-1] + arr[i];
        }

        return pref;
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = makePrefixSumArray(arr);
        printArray(ans);

        sc.close();
    }
}

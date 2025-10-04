import java.util.Scanner;

public class PrefixSumPartation {

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartation(int[] arr){
        int totalSum = findArraySum(arr);

        int PrefSum = 0;

        for(int i = 0; i < arr.length; i++){
            PrefSum = PrefSum + arr[i];
            int suffixSum = totalSum - PrefSum;
            if(suffixSum == PrefSum){
                return true;
            }
        }
        return false;
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

        System.out.println("Equal Partation Possible: " + equalSumPartation(arr));

        sc.close();
    }
    
}

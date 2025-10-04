import java.util.Scanner;
import java.lang.Math;

public class SortedSquare {

    static int[] SortedArray(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];
        int k = 0;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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

        int[] ans = SortedArray(arr);
        printArray(ans);

        sc.close();
    }  
}

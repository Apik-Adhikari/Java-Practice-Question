import java.util.Scanner;

public class SortedArray {

    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int zeroes = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }

        for(int i = 0; i < n; i++){
            if (i < zeroes){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sortZeroesAndOnesInplace(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                    left++;
                    right--;
                }

            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }

    }


    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the array");

    for(int i=0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    // sortZeroesAndOnes(arr);
    // printArray(arr);

    sortZeroesAndOnesInplace(arr);
    printArray(arr);

    sc.close(); 
}
}

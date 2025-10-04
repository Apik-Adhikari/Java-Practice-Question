import java.util.Scanner;

public class SecondMax {

    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr){
        int max = findMax(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int l = sc.nextInt();

        int[] arr = new int[l];
        System.out.println("Enter the numbers");

        for(int i=0; i < l; i++){
            arr[i] = sc.nextInt();

        }

        int secondMaxValue = findSecondMax(arr);
        System.out.println("Second Maximum value: " + secondMaxValue);

        sc.close();
    }
    
}

public class countSort{

    static void display(int[] arr){
        for(int val: arr){
            System.out.print(val + " ");
        }
    }

    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void basicCountSort(int[] arr){
        int max = findMax(arr);
        int[] freq = new int[max + 1];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        int index = 0;
        for(int i = 0; i < freq.length; i++){
            for(int j = 0; j < freq[i]; j++){
                arr[index] = i;
                index++;
            }
        }
    }

    static void countSortWithPrefixSum(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] freq = new int[max + 1];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        for(int i = 1; i < freq.length; i++){
            freq[i] += freq[i - 1];
        }

        for(int i = n - 1; i >= 0; i--){
            int idx = freq[arr[i]] - 1;
            output[idx] = arr[i];
            freq[arr[i]]--;
        }

        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }

    public static void main(String[] args){
        int[] arr = {4,2,2,8,3,3,1};
        basicCountSort(arr);
        display(arr);
        System.out.println();
        countSortWithPrefixSum(arr);
        display(arr);
    }
}
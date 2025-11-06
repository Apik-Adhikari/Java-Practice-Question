public class sort012 {

    static void display(int[] num){
        for(int val : num){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void sort012(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        System.out.println("Original Array:");
        display(arr);
        sort012(arr);
        System.out.println("Sorted Array:");
        display(arr);
    }
}

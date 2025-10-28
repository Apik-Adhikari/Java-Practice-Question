public class quickSort {

    static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;

        for(int i = st + 1; i <= end; i++){
            if(arr[i] <= pivot) count++;
        }

        int pivotIdx = st + count;
        swap(arr, pivotIdx, st);
        int i = st, j = end;

        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        System.out.println("Original Array:");
        displayArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted Array:");
        displayArray(arr);
    }
}

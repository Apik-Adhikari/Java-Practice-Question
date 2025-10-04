public class sumOfArray {

    static int sumOfArray(int[] arr, int idx) {
        if (idx == arr.length) return 0;
        int smallAns = sumOfArray(arr, idx + 1);
        return arr[idx] + smallAns;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumOfArray(arr, 0));
    }
}

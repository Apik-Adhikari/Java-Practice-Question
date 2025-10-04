public class maxInArray {

    static int maxInArrray(int[] arr, int idx) {
        if (idx == arr.length - 1) return arr[idx];
        int smallAns = maxInArrray(arr, idx + 1);
        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 3, 2, 5};
        System.out.println(maxInArrray(arr, 0));
    }
    
}

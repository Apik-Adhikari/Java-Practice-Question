public class linearSearch {

    static boolean search(int[] arr, int idx, int target) {
        if (idx == arr.length) return false;
        if (arr[idx] == target) return true;
        return search(arr, idx + 1, target);
    }

    static void finAllIndices(int[] arr, int idx, int target) {
        if (idx == arr.length) return;
        if (arr[idx] == target){
            System.out.print(idx + " ");
        }
        finAllIndices(arr, idx + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5};
        int target = 4;
        System.out.println(search(arr, 0, target));
        finAllIndices(arr, 0, target);
    }
    
}

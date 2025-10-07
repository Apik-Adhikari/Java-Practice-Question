import java.util.ArrayList;

public class findAllIndices{

    static ArrayList<Integer> findAllIndices(int[] arr, int idx, int target) {
        if (idx >= arr.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = findAllIndices(arr, idx + 1, target);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5};
        int target = 4;
        ArrayList<Integer> ans = findAllIndices(arr, 0, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    } 
}

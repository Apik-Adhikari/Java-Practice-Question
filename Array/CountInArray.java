public class CountInArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 45, 12, 34, 67, 45};
        int target = 12;
        int count = 0;

        for(int i=0; i < arr.length; i++){
            if(target == arr[i]){
                count++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Target = " + target);
        

        System.out.println("Element " + target + " found " + count + " times in the array.");
        if(count == 0){
            System.out.println("Element not found in the array.");
        }
    }
}

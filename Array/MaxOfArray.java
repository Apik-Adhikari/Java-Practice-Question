public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 45};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }

}

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 45};
        int target = 55;
        boolean isContained = false;

        for(int i = 0; i < arr.length; i++){
            if( target == arr[i]){
                System.out.println("Element found at index: " + i);
                isContained = true;
                break; 
            }
        } 
        if(!isContained){
            System.out.println("Element not found in the array.");
        }
    }
}

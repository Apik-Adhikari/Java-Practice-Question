public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int target = 12;

        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                for (int k = j+1; k < arr.length; k++){
                if(arr[i] + arr[j] + arr[k] == target){
                    System.out.println(arr[i] + "," + arr[j]+ "," + arr[k]);
                }
            }
            }
        }
        
    }

    
}

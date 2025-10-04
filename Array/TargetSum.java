public class TargetSum{
    public static void main(String[] args) {
        
        int[] arr = {4 ,6 ,3 ,5 ,8 ,2 ,1 };
        int target = 7;

        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
}
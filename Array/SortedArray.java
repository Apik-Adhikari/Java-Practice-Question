public class SortedArray {
    public static void main(String[] args) {
        
      int[] arr = {3, 5, 5, 8, 9};

      boolean isSorted = true;
      
      for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1] ){
                isSorted = false;
                break;
            }
        }
      if(isSorted){
        System.out.println("Sorted Array");
      }else{
        System.out.println("Not a Sorted Array");
      }
       
    }
    
}

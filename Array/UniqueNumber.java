public class UniqueNumber {
    public static void main(String[] args) {

        int[] arr = {4 ,6 ,4 ,5 ,8 ,2 ,1 ,6 };
        boolean isUnique;

        for(int i = 0; i < arr.length; i++){
            isUnique = true;
            for (int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    isUnique = false;
                    break;
                } 
            }
            if(isUnique){
                System.out.println("Unique number: " + arr[i]);
            }
        }
   }
}

public class RepeatedTwice {
    public static void main(String[] args) {

        int[] arr = {4 ,6 ,4 ,5 ,8 ,2 ,1 ,6 };

        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Repeated number: " + arr[i]);
                }
            }
        }  
    }
}

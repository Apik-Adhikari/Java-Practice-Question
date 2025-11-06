// public class sortArray {

//     static void display(int[] arr) {
//         for (int val : arr) {
//             System.out.print(val + " ");
//         }
//         System.out.println();
//     }

//     static void sortArray(int[] num) {
//         int n = num.length;
//         int x = -1;
//         int y = -1;

//         if (n <= 1) {
//             return;
//         }

//         for(int i = 1; i < n; i++) {
//             if (num[i - 1] < num[i]) {
//                 if(x == -1) {
//                     x = i - 1;
//                     y = i;
//                 }
//             }else{
//                 y = i;
//             }
//         }
//         int temp = num[x];
//         num[x] = num[y];
//         num[y] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 5, 3, 4, 6};
//         sortArray(arr);
//         display(arr);
//     }
// }


class sortArray {
    static void display(int[] num){
        for(int val : num){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void sortArray(int[] num){
        int n = num.length;
        int x = -1, y = -1;
        if(n <= 1){ // corner case, edge case
            return;
        }
        //process all adjacent elements
        for(int i = 1; i < n; i++){
            if(num[i-1] > num[i]){
                if(x == -1){ // first conflict
                    x = i-1;
                    y = i;
                } else { // 2nd conflict
                    y = i;
                }
            }
        }
        // swap x, y in num
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }

    public static void main(String[] args) {
        int[] num = {3,8,6,7,5,9,10};
        sortArray(num);
        display(num);
    }
}
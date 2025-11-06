public class sortPosNeg {

    static void display(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void partition(int[] num){
        int l = 0;
        int r = num.length - 1;
        while(l < r){
            while(l < r && num[l] < 0) l++;
            while(l < r && num[r] >= 0) r--;
            if(l < r){
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {12, -7, 5, -3, 8, -1, 4};
        System.out.println("Original Array:");
        display(num);
        partition(num);
        System.out.println("Partitioned Array:");
        display(num);
    }  
}


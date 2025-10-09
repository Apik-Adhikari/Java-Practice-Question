public class bubbleSort{

    static void bubblesort(int[] a){
        int n = a.length;
        boolean flag = false;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {64, 34, 25, 12, 22, 11, 90};
        bubblesort(a);
        for(int i : a){
            System.out.println(i);
        }
    }
}

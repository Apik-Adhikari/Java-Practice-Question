public class fibonacci{
    static int fib(int n){
        if ( n == 0 || n == 1 ){
            return n;
        } 
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));
    }
}


// Time Complexity: O(2^n)
// Space Complexity: O(n) (due to recursion stack)

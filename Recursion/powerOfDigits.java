public class powerOfDigits{
    static int power1(int p, int q){
        if ( q == 0) return 1;
        return power1(p,q-1) * p;

        // Time Complexity: O(q)
        // Space Complexity: O(q) (due to recursion stack)
    }

        static int power2(int p, int q){
        if ( q == 0) return 1;
        int smallPower = power2(p, q/2);
        if( q % 2 == 0 ){
            return smallPower * smallPower;
        }
        return smallPower * smallPower * p;

        // Time Complexity: O(log q)
        // Space Complexity: O(log q) (due to recursion stack)
    }

    public static void main(String[] args) {
        System.out.println(power1(5,4));
        System.out.println(power2(5,4));
    }
}


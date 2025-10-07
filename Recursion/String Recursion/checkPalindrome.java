public class checkPalindrome {

     static String reverseString(String s, int idx){
        if (idx == s.length()) return "";
        String smallAns = reverseString(s, idx + 1);
        return smallAns + s.charAt(idx);
    }

    // Checking palindrome using two pointer approach
    static boolean checkPalindrome(String s, int start, int end){
        if (start >= end) return true;
        return (s.charAt(start) != s.charAt(end)) && checkPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "racecar";
        boolean result1 = checkPalindrome(s, 0, s.length() - 1);
        System.out.println(result1);

        String reversed = reverseString(s, 0);
        if(reversed.equals(s)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
    }
}
}
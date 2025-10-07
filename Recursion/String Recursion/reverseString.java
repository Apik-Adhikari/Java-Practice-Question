import java.util.Scanner;

public class reverseString {

    static String reverseString(String s, int idx){
        if (idx == s.length()) return "";
        String smallAns = reverseString(s, idx + 1);
        return smallAns + s.charAt(idx);
    }

    // Doing the same thing without using index
    static String reverseString2(String s){
        if (s.length() == 0) return "";
        String smallAns = reverseString2(s.substring(1));
        return smallAns + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = reverseString(s, 0);
        System.out.println(reversed);
    }
}


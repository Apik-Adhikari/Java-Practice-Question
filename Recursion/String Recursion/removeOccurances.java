import java.util.Scanner;

public class removeOccurances{

    static String removeA(String s, int idx){
        if (idx == s.length()) return "";
        String smallAns = removeA(s, idx + 1);
        char currChar = s.charAt(idx);
        if (currChar == 'a'){
            return smallAns;
        } else {
            return currChar + smallAns;
        }
    }

    // Doing the same thing without using index
    static String removeA2(String s){
        if (s.length() == 0) return "";
        String smallAns = removeA2(s.substring(1));
        char currChar = s.charAt(0);
        if (currChar == 'a'){
            return smallAns;
        } else {
            return currChar + smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = removeA(s, 0);
        System.out.println(result);
    }
}

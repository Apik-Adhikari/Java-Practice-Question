public class printingSSQ {
    static void printSSQ(String S, String currAns) {
        if (S.length() == 0) {
            System.out.println(currAns);
            return;
        }
        char curr = S.charAt(0);
        String remString = S.substring(1);
        printSSQ(remString, currAns + curr);
        printSSQ(remString, currAns);
    }

    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}

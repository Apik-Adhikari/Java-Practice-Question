import java.util.ArrayList;

public class returnSSQ{
    static ArrayList<String> getSSQ(String S){
        ArrayList<String> ans = new ArrayList<>();
        if(S.length() == 0){
            ans.add("");
            return ans;
        }
        char curr = S.charAt(0);
        ArrayList<String> smallAns = getSSQ(S.substring(1));
        for(String s : smallAns){
            ans.add(s);
            ans.add(curr + s);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for(String s : ans){
            System.out.println(s);
        }   
    }
}
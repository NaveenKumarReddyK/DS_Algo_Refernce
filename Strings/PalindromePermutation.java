import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static boolean isPalindrome(String s){
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                if(h.containsKey(s.charAt(i))){
                    int count = h.get(s.charAt(i));
                    h.put(s.charAt(i),count+1);
                }
                else{
                    h.put(s.charAt(i),1);
                }

            }
        }
        int oddCount = 0;
        for(Map.Entry mp:h.entrySet()){
            int val = (int) mp.getValue();
            if(val % 2 == 1){
                oddCount++;
            }
        }
        return oddCount<=1;
    }
    public static void main(String[] args) {
        String s = "fuck you oy kcuf";

        if(isPalindrome(s.toLowerCase())){
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}

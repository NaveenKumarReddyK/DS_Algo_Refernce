import java.util.*;

public class StringCompressiong {
    public static String compressString(String s){
        if(isUnique(s)){
            return s;
        }
        HashMap<Character,Integer> h = new HashMap<>();
        h.put(s.charAt(0),1);
        String new_str = "";
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(h.containsKey(c)){
                int count = h.get(c);
                h.put(c,count+1);
            }
           else{
                char prevChar = s.charAt(i-1);
                new_str  = new_str+prevChar+h.get(prevChar);
                h.clear();
                h.put(c,1);
            }

        }
        return new_str;
    }
    public static boolean isUnique(String s){
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!al.contains(s.charAt(i))){
                al.add(s.charAt(i));
            }
        }
        return s.length() == al.size();
    }
    public static void main(String[] args) {
        String s = "aabccddddeeeaaa";
 
        System.out.println(compressString(s));
 
    }
}

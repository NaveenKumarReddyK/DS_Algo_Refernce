/*
* not yet completed
* */
import java.util.*;
class Trie_Palindrome_Pairs {
    public static  List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],i);
        }

        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);

            StringBuilder rev = sb.reverse();
        if(sb.length()==1){
            continue;
        }
            for(int j=1;j<=rev.length();j++){
                String cs = rev.substring(0,j).toString();
                if(map.containsKey(cs)){
                     StringBuilder curr = sb;
                    if(isPalindrome(curr.append(cs))){
                        System.out.println(cs);
                        List<Integer> l = new ArrayList<>();
                        l.add(i,map.get(cs));
                        list.add(l);
                    }
                }
            }
        }
        return list;

    }
    public static  boolean isPalindrome(StringBuilder sb){
        // StringBuilder sb = new StringBuilder(s);
        StringBuilder temp = new StringBuilder(sb);
        return temp.equals(temp.reverse());

    }

    public static void main(String[] args) {
        String[] words = {"abcd","dcba","lls","s","sssll"};
        System.out.println(palindromePairs(words));
    }
}
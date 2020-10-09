import java.util.*;
public class Plaindrome_Pairs {
        public static List<List<Integer>> palindromePairs(String[] words) {
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            HashMap<String,Integer> map= new HashMap<>();
            //4 possibilites of getting palindorme
            //length == even
            // 1.
            int k=0;
            for(String s : words){
                map.put(s,k);
                k++;
            }
            for(int i=0;i<words.length;i++){
                StringBuilder sb = new StringBuilder(words[i]);
                sb.reverse();
                String curr = sb.toString();
                //reverse an chech if every sub string is there in it

                for(int j=1;j<words[i].length();j++){

                    if(map.containsKey(curr.substring(j))){
                        StringBuilder sb2 = new StringBuilder(words[i]);
                        System.out.println(curr.substring(j));
                        if(isPalindrome(sb2.append(curr.substring(j)).toString())){

                            List<Integer> l = new ArrayList<Integer>();
                            l.add(i, map.get(curr.substring(j)));
                            list.add(l);
                        }
                    }
                }
            }

            return list;
        }
        public static boolean isPalindrome(String s){
            StringBuilder sb = new StringBuilder(s);
            return s.equals(sb.reverse().toString());
        }

    public static void main(String[] args) {
        String[] words = {"abcd","dcba","lls","s","sssll"};
        System.out.println(palindromePairs(words));
    }
    }

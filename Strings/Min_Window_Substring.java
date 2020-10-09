import java.util.*;

// Given a string S and a string T, find the
//  minimum window in S which will contain all the characters in T in complexity O(n).
class Min_Window_Substring{
    public static String minWindow(String S,String T){
        int counter = T.length();
        int minLen = Integer.MAX_VALUE;
        int[] res = new int[2];//start and end of the result
        int start = 0;
        int end = 0;
        int[] map = new int[128];
        for(char c : T.toCharArray()){
            map[c]++;
        }
        while(end < S.length()){
            //check if character exists
            //then move the window
            char curr = S.charAt(end);
            if(map[curr] >= 1){
                counter--;
            }
            //remove char count from map
            map[curr]--;
            //increment the right side of window
            end++;

            //if counter is 0 then we encountered all charatcers in T
            while(counter == 0){
                if(minLen > (end - start)){
                    minLen = end - start;
                    res[0] = start;
                    res[1] = end;
                }
                //move the lefside of the window
                char prev = S.charAt(start);
                start++;
                map[prev]++;
                if(map[prev] > 0){
                        counter++;
                }
            }
        }

        return S.substring(res[0],res[1]);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = "NAVEENKUMARREDDY";
        String T = "VEENA";
        System.out.println(minWindow(S, T));
    }
}
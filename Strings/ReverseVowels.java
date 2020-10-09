 import java.util.*;
class ReverseVowels {
    public static String reverseVowels(String s) {
        //GET  ALL THE VOWELS IN THE STRING
        // TAKE THEIR POSITION AND REVERSE THE POSITIONS IN NEXT STRING

        char[] arr = s.toCharArray();
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            char curr = arr[i];
            if(isVowel(curr)){
                l.add(i);
            }
        }
        if(l.size() == 0){
            return s;
        }
        int start = 0;
        int end = l.size()-1;
        while(start<end){
            int f = l.get(start);
            int t = l.get(end);
            char temp = arr[f];
            arr[f] = arr[t];
            arr[t] = temp;
            start++;
            end--;
        }
        return  String.valueOf(arr);

    }
    public static  boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "naveen";
        System.out.println(reverseVowels(s));;
    }

}
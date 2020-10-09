import java.util.ArrayList;

public class PermutationOfOther {
    public static boolean isPerm(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            al.add(s1.charAt(i));
        }
        for(int j=0;j<s2.length();j++){
            if(!al.contains(s2.charAt(j))){
                 return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "naveen";
        String s2 = "navene";
        if(isPerm(s1,s2)){
            System.out.println("String are permutated");
        }
        else {
            System.out.println("Strings are not permutation of each other");
        }
    }
}

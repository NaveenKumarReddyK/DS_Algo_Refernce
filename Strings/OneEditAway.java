public class OneEditAway {
    public static boolean isOneEditAway(String s1,String s2){
        if((s1.length() != s2.length()) && (s1.length()-1 != s2.length())){
            return false;
        }
        if(s1.length() == s2.length()){
            int count = 0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    count++;
                }
            }
            if(count == 1){
                return true;
            }
        }
//        int i = 0;
//        int j = 0;
//        while(i<s1.length() && j<s2.length()){
//            if(s1.charAt(i) == s2.charAt(j)){
//                i++;
//                j++;
//            }
//            if(s1.charAt(i) != s2.charAt(j)){
//                i++;
//            }
//        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "naveen";
        String s2 = "nneen";

        if(isOneEditAway(s1,s2)){
            System.out.println("Is one edit away");
        }
        else {
            System.out.println("Not one edit away");
        }
    }
}

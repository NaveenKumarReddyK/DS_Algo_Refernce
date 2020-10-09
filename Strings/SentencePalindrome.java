
class SentencePalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            int charVal = s.charAt(i);
            if( charVal>=97 && charVal<=122){
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
//        System.out.println(s);
        int fp = 0;
        int rp = s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(fp) != s.charAt(rp)){

                return false;
            }
            fp++;
            rp--;
        }
        return true;

    }
/** ANOTHER IMPLEMENTATION
  int low = 0;
        int high = s.length()-1;
        s = s.toLowerCase();
        while(low<high){
            if(!Character.isAlphabetic(s.charAt(low))){
                low++;
            }
            else if(!Character.isAlphabetic(s.charAt(high))){
                high-- ;
            }
            else{
                if(s.charAt(low) != s.charAt(high)){
                    return false;
                }
                low++;
                high--;
            }
        }
        return true;
 */
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
//        isPalindrome(s);
//        System.out.println(s);
    }
}
// https://leetcode.com/discuss/interview-question/306859/Google-or-Phone-screen-or-Split-strings-to-form-a-palindrome
public class Split_String_To_Palindrome {
    public static void main(String[] args) {
        String A = "abcbbbb";
        String B = "xxxbcba";
        //traverse from A start and B end (one traversal)
        //traverse from A end and B start (second tarversal)
        //compare the indexes
        int aStart = 0;
        int bEnd = B.length()-1;
        int aEnd = A.length()-1;
        int bStart = 0;
        // first
        while(A.charAt(aStart) == B.charAt(bEnd)){
            aStart ++;
            bEnd--;
        }
        //second
        while(A.charAt(aEnd) == B.charAt(bStart)){
            aEnd--;
            bStart++;
        }
        //check indexes
        System.out.println("aStart :"+aStart);
        System.out.println("aEnd :"+aEnd);
        System.out.println("bStart :"+bStart);
        System.out.println("bEnd :"+bEnd);
        // abc b cba || abc cba
        boolean a1b2 = (aStart+bEnd == A.length()) || (aStart+bEnd == A.length()-1);
        boolean a2b1 = (bStart+aEnd == B.length()) || (bStart+aEnd == B.length()-1);
        int index = -1;
        if(a1b2 || a2b1){
            index = aStart -1 > bEnd ? aStart - 1 : bEnd - 1;
        }
         
        System.out.println(a1b2 || a2b1);
        System.out.println("Split at index : "+index);
    }
}

import java.util.SplittableRandom;

public class URLify {
    public static String urLify(String s){
        int len = s.length();
        int spaceCount = 0;
        for(int i=0;i<len;i++){
            if(s.charAt(i) == ' '){
                spaceCount++;
            }
        }
        if(spaceCount == 0){
            return s;
        }
        int totalLength = len+spaceCount*3;
        char[] arr = new char[totalLength];
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                arr[totalLength-1] = '0';
                arr[totalLength-2] = '2';
                arr[totalLength-3] = '%';
                totalLength = totalLength-3;
            }
            else{
                arr[totalLength-1] = s.charAt(i);
                totalLength--;
            }
        }


        return new String(arr);

    }
    public static void main(String[] args) {
        String s = "naveen kumar reddy";
        System.out.println(urLify(s));
    }
}

import java.util.*;
public class Excel_Col_Number {
        public static int titleToNumber(String s) {
            //char - 94 since A=95
            if(s.length() == 1){
                return (int) s.charAt(0);
            }
            String sb = new StringBuilder(s).reverse().toString();
            int num = sb.charAt(0) - 94;


            for(int i=1;i<sb.length();i++){
                int mul = 26;
                for(int j=0;j<i;j++){
                    mul*=mul;
                }
                num+= (sb.charAt(i) - 94)*mul;
            }
            return num;

        }

    public static void main(String[] args) {
        String word = "A";
        System.out.println(titleToNumber(word));
    }
    }


import java.util.*;
//Integer to Roman for number below 4000

public class Integer_To_Roman {
    public static String getRomanNumber(int num) {
            String M[] = {"", "M", "MM", "MMM"};
            String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            
            return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        System.out.println(getRomanNumber(num));
    }
}

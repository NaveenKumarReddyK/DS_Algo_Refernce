import java.util.*;
public class GCD_LCM {
    public static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static int lcm(int a,int b){
        //  product/gcd
        return a*b/gcd(a,b);
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("GCD  : " + gcd(a,b));
            System.out.println("LCM  : " + lcm(a,b));
    }
}

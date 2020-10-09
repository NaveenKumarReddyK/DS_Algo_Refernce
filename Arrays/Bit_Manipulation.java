 
// "static void main" must be defined in a public class.
public class Bit_Manipulation {
    public static void main(String[] args) {
        //Left Shift
        // i << x   => (i)*2^x
        int i = 4;
        int x = 2;
        int leftShift = i<<x;
        System.out.println(leftShift);
        
        //Right Shift
        // x>>i     => (2^x)/i 
        int rightShift = i>>x;
        System.out.println(rightShift);
        
        //Right Cirucular Shift
        // i>>>x = i/(2^x)
        int rightCircularShift = 16 >>> 2;
        System.out.println(rightCircularShift);
        
        //Left Cirucular Shift
        // i<<<x = i/(2^x)
        //Eqivalent to x << i (reverse i,x and then left shift)
        int leftCircularShift = 16 << 2;
        System.out.println(leftCircularShift);
    }
}
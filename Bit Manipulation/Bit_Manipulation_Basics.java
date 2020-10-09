public class Bit_Manipulation_Basics {
    public static void main(String[] args) {
        //Left Shift
        // i << x   => (i)*2^x
        int i = 4;
        int x = 2;
        int leftShift = i<<x;
        System.out.println(leftShift);
        
        //Right Shift
        // i>>x     => (2^x)/i 
        int rightShift = 4>>2;
        System.out.println(rightShift);
        
        //Right Cirucular Shift
        // i>>>x = i/(2^x) 
        int rightCircularShift = 16 >>> 2;
        System.out.println(rightCircularShift);
        
        //Left Cirucular Shift
        // i<<<x = i*(2^x) Eg. 2 <<< 16  ==>  16 << 2
        //Eqivalent to x << i (reverse i,x and then left shift)
        int leftCircularShift = 16 << 1;
        System.out.println(leftCircularShift);
    }
}

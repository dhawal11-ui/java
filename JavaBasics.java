public class JavaBasics {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) { // last bit nikaltaa hai & bitmask(1) . 0 rhi to odd 1 rhi to even l.
            System.out.println("even no");
        } else {
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {  
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int clearIthBits(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(n, i);

        // } else {
        //     return setIthBit(n, i);
        // }

        //approach 2 

        n= clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n|BitMask;

    }

   
    public static void main(String[] args) {
        System.out.println(clearIthBits(15, 2));
    }
}
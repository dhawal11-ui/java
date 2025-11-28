public class JavaBasics {
    public static void oddOrEven(int n){
    int bitMask = 1;
    if((n & bitMask) ==0){ // last bit analyse . 0 rhi to odd 1 rhi to even l.
        System.out.println("even no");
    }else{
        System.out.println("odd number");
    }
}
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
    }
}
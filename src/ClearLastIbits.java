public class ClearLastIbits {

    public static int LastIthBits(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(  LastIthBits(15,2));
    }
}

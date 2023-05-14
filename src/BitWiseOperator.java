public class BitWiseOperator {

    public static void main(String[] args) {
        System.out.println(5 & 6); //& operator
        System.out.println(5|6);  //| or operator
        System.out.println(5^6);
        System.out.println(1^0);
        System.out.println(1^1);   // xor operator
        System.out.println(0^0);
        System.out.println(0^1);

        // binary one's complement
        System.out.println(~5);

        // binary left shift
        System.out.println(5<<2);
        //binary right shift
        System.out.println(6>>1);


    }
}

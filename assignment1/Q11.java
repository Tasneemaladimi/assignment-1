public class Q11 {
    public static boolean iseven(int i){
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(iseven(4));
        System.out.println(iseven(7));
        System.out.println(iseven(-2));
        System.out.println(iseven(-3));

    }
}

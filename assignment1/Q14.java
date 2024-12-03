public class Q14 {
    public static int square(int n){
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(square(3));
        System.out.println(square(4));

    }
}

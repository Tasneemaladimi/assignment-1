public class Q12 {
    public static int calculator(int n){
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculator(5));
        System.out.println(calculator(10));

    }
}

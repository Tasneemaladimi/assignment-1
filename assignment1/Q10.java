import java.util.Scanner;

public class Q10 {
    public static boolean ismultiple(long n, long m){
        if(m==0){
            return false;
        }
        return n % m == 0;
    }

    public static void main(String[] args) {

       long n = 20;
    long m = 5;
        System.out.println(ismultiple(n,m));
        n = 21;
        m = 5;
        System.out.println(ismultiple(n,m));
    }
}

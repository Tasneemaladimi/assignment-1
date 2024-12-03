import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your id ,name ,major 3 times:");
        Q7 arr[]= new Q7[3];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=new Q7(in.nextInt(),in.next(),in.next());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int arr[]= new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=obj.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

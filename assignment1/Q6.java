import java.util.Scanner;

public class Q6 {
    public void hello(){

        Scanner in= new Scanner(System.in);
        int arr[]= new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=in.nextInt();
        }
        printAll(arr);

    }

    public static void printAll(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        Q6 obj= new Q6();
        obj.hello();
    }













}



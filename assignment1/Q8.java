import java.util.Scanner;

public class Q8 {
public static void types(){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int intvalue= obj.nextInt();
    System.out.println("You entered int:"+intvalue);
    System.out.println("Enter a double: ");
    double doublevalue=obj.nextDouble();
    System.out.println("You entered double: "+doublevalue);
    System.out.println("Enter a character: ");
    char charvalue=obj.next().charAt(0);
    System.out.println("You entered char: "+charvalue);

    System.out.println("Enter a boolean(true/false): ");
    boolean boolvalue=obj.nextBoolean();
    System.out.println("You entered boolean: "+boolvalue);
    obj.close();
}
    public static void main(String[] args) {
        types();
    }
}

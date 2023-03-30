import java.util.*;
public class functions1 {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println("Sum is: " + result);
        sc.close();
    }
}

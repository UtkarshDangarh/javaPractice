import java.util.*;
public class calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println(num1 + num2);
            
        }
        else if (op == '-') {
            System.out.println(num1 - num2);
        }
        else if (op == '*') {
            System.out.println(num1 * num2);
        }
       
        else if (op == '/') {
            System.out.println(num1 / num2);
        }
        sc.close();
    }
}

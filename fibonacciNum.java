import java.util.Scanner;

public class fibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int n =  sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = a;
            a = b;
            b = temp + b;
            count ++;
        }
        System.out.println(b);
        sc.close();
    }
}

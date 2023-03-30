import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Enter Power: ");
        int pow = sc.nextInt();
        int x = num;
        for (int i = 2; i <=pow ; i++) {
            num = num *x;
        }
        System.out.println(num);
        sc.close();
    }
}

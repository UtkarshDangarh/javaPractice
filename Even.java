import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int num = sc.nextInt();

        if (num%2 == 0) {
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");    
        }
        sc.close();
    }
}

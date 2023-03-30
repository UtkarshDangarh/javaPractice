import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = num;
        int ams = 0;
        int temp;
        while (x>0) {
            temp = x%10;
            ams = ams + (temp * temp * temp);
            x = x/10;
        }
        if (num == ams) {
            System.out.println("It is a armstrong number");
        } else {
            System.out.println("Not a armstrong number");
        }
        sc.close();
    }
}

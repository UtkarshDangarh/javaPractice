import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = num;
        int temp;
        int sum = 0;
        while (x>0) {
            temp = x%10;
            sum = sum + temp;
            x = x/10;
        }
        System.out.println(sum);
        sc.close();
    }
}

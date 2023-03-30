import java.util.Scanner;

public class sumOfnNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
        //For average of n numbers
        //int avg = sum/n;
        //System.out.println("Average is: " + avg);
        sc.close();
    }
}

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);

        for(int i = 2; i<=d; i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }
}

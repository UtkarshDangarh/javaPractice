import java.util.Scanner;

public class sum2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int sum = 0; // for sum of all no. program
        int lar = 0; // for lasrgest number from all the input program
        while(true){
            int num = sc.nextInt();
            // sum = sum + num; // for sum
            if (num > lar) {
                lar = num;
            }

            if (num == 0) {
                break;
           }
        }
        System.out.println(lar);
        sc.close();
    }
}

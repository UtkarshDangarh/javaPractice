public class pattern7 {
    public static void main(String[] args) {
        int n =4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j); // n-j+1 for reverse
            }
            System.out.println();
        }
    }
}

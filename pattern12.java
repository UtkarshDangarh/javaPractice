public class pattern12 {
    public static void main(String[] args) {
        int n = 3;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch);
                ch = (char) (ch+1);
            }
            System.out.println();
        }
    }
}

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2 * n- row : row;  //no of Columns if i > n; 2n-i: i;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
//        int count = 1;  // to print simple counting
        for (int i = 1; i <=n; i++) {
            int count = i; //to start row from row no.
            for (int j = 1; j <=i; j++) {
                
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}

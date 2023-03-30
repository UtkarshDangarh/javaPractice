public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) { // here the no. of row we are at it will have the same ammount of columns for eg. if we are at row 1 then only 1 col, and at row 4 4 columns
                System.out.print(j);
            }
            System.out.println(""); // we need to go to next line 
        }
    }
}

public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {  // we are using n-i+1 because we are starting value of i from 1, if we start value of i from 0 then we can use n-i (i is no of rows)
                System.out.print("* ");
            }
            System.out.println(""); // we need to go to next line 
        }
    }
}

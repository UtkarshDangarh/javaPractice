public class reoccurringNum {
    public static void main(String[] args) {
        int n  = 334333758;
        int count = 0;
        int rem;
        while(n>0){
            rem = n%10;
            if (rem == 3) {
                count++;
            }
            n =n/10;
        }
        System.out.println(count);
    }
}

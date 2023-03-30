import java.util.*;
public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rupees");
        float rupee = sc.nextFloat();
        float dollor = rupee/81.97f;
        System.out.println("amount in Dollor is " + dollor);
        sc.close();
    }
}

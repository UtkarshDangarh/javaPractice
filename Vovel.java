import java.util.Scanner;

public class Vovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
           System.out.println("Character is a Vovel"); 
        } else {
            System.out.println("Character is a Consonant");
        }
        sc.close();
    }
}

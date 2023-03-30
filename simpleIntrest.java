import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Ammount: ");
        int principal = sc.nextInt();
        System.out.println("Enter Time in months");
        int time = sc.nextInt();
        System.out.println("Enter Rate of Intrest");
        int rate = sc.nextInt();
        float intrest = (principal * rate * time)/100;
        System.out.println("Total intrest is " + intrest);
       
        sc.close();
    }
}

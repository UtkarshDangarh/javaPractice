import java.util.Scanner;

public class palindrom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       // We using x because we have to compare number with reverse digit, we are performing operations to break the digit on x  
        int x = number;
      // We are using temp to store output of operaions performed on X, and to create the reverse number
        int temp;
        int reverseNum = 0;
        while(x>0){
            temp = x%10;
         reverseNum = reverseNum*10 + temp;
            x=x/10;
            }
        System.out.println(reverseNum);
        if (number == reverseNum) {
            System.out.println(number + " is a palindrome");
        }else{
            System.out.println(number + " is not a palindorme");
        }
        sc.close();
    }
}




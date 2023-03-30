public class factorsOfANum {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0; //For perfect number
        for (int i = 1; i <num; i++) {
            if (num % i == 0) {
                sum = sum + i;
//                System.out.println(i);
            }
        }
// conditiona l section is for perfect number

        if(sum == num){
            System.out.println("It is a perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }    
}

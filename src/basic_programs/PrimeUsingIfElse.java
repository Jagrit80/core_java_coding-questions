package basic_programs;

import java.util.Scanner;

public class PrimeUsingIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();
        input.close();
        if (Number<=1){
            System.out.println(Number + " is Not Prime Number\n");

        }else {
            boolean isPrime = true;
            for (int i = 2; i*i <= Number ; i++) {
                if (Number%i==0){
                    isPrime = false;
                } else if (isPrime) {
                    System.out.println(Number + " is a Prime Number\n");
                } else {
                    System.out.println(Number + " is not a Prime Number\n");
                    break;
                }
            }

        }
    }
}

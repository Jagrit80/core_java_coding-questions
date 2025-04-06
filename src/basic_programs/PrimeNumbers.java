package basic_programs;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 2; i<=n; i++){
            boolean isPrime = true;
            for (int j = 2;j<i;j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }if (isPrime){
                System.out.println(i + "\n");
            }
        }

    }
}

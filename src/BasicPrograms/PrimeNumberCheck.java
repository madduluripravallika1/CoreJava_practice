package BasicPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(" Prime Number Check");
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int num=scanner.nextInt();
        boolean isPrime=true;
        if(num<=1){
            System.out.println(" 0 , 1 are not the prime numbers");
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
               if(num%1==0){
                   isPrime=true;
                   break;
               }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }

        }

    }
}

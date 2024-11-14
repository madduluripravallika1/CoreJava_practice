package BasicPrograms;

import java.util.Scanner;

public class CheckEvenorOdd {
    public static void main(String[] args) {
        System.out.println("Check Even or Odd:");
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter the num1: " );
        int num1=scanner.nextInt();

        if(num1%2==0){
            System.out.print(" Print the even ");
        }else {
            System.out.print(" Print the  odd");
        }
        scanner.close();
    }
}

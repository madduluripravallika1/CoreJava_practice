package BasicPrograms;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" working on Sum of Two Numbers");
        System.out.println(" Enter the number1: ");
        int num1=scanner.nextInt();
        System.out.println(" Enter the number2: ");
        int num2=scanner.nextInt();
        int num3=num1+num2;
        System.out.println(" SUm the 2 numbers:"+num3);
    }
}

package BasicPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Swap Two Numbers:");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        int num1=scanner.nextInt();
        System.out.print("Enter the num2 : ");
        int num2=scanner.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping :");
        System.out.print(" The value of  num1 is : "+num1);
        System.out.print(" The  value of num2 is : "+num2);
        scanner.close();

    }
}

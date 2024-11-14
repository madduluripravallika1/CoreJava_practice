package BasicPrograms;

import java.util.Scanner;

public class FindMaximumofThreeNumbers {
    public static void main(String[] args) {
        System.out.println(" Find Maximum of Three Numbers");
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter the number1");
        int num1=scanner.nextInt();
        System.out.println(" Enter the number2");
        int num2=scanner.nextInt();
        System.out.println(" Enter the number3");
        int num3=scanner.nextInt();
       int max=Math.max(num1,Math.max(num2,num3));
        System.out.println(" print the maximun number"+max);

    }
}

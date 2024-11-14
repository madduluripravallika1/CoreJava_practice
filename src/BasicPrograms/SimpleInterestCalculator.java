package BasicPrograms;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        System.out.println("Simple Interest Calculator");
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter the p value ");
        double p=scanner.nextDouble();
        System.out.println(" Enter the t value ");
        double t=scanner.nextDouble();
        System.out.println(" Enter the r value ");
        double r=scanner.nextDouble();
        double intrest;
        intrest=(p*t*r)/100;
        System.out.println("The Simple intrest is: "+ intrest);
        scanner.close();
    }
}

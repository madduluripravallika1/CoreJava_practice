package BasicPrograms;

import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] args) {
        System.out.println("Factorial of a Number:");
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter the Factorial of a Number:");
        int num1=scanner.nextInt();
        long factorial=1;
        if(num1<0){
            System.out.println("  We can't do when the number is factorial !!!!!");
        } else if (num1==0) {
            System.out.println(" The Factorial of zero is 1");
        }else{
            for (int i = 1; i<=num1; i++){
                factorial*=i;
            }
            System.out.println(" The factorial of :"+num1+"is "+factorial);
        }
        }
    }


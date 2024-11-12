package DivisionOperationinaCalculator;

import java.util.Scanner;

public class DivisionOperationinaCalculator {
    public void method1(){
        System.out.println(" Doing the Division Operation in a Calculator");
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter a number to divide : ");
        int num=scanner.nextInt();
        try {
            int n1=num/num;
            System.out.println(" Division BY Zero !!!!!!!"+n1);

        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
    }
    public static void main(String[] args) {
        DivisionOperationinaCalculator divisionOperationinaCalculator=new DivisionOperationinaCalculator();
        divisionOperationinaCalculator.method1();
    }
}



//Division Operation in a Calculator
//Question: In a calculator application, if the user tries to divide by zero, it should throw an error indicating that the operation is invalid.
//
//Clue:
//
//Use try to perform the division operation.
//throw an exception if the denominator is zero.
//Use catch to handle the exception and display an error message about the invalid operation.

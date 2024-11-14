package BasicPrograms;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        System.out.println("if a given year is a leap year.");
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter the year : ");
        int year=scanner.nextInt();
        boolean isLeap= (year%4==0 && year%1000!=0||year%400==0);
        if(isLeap){
            System.out.println(" The YEar is  Leap Year: "+isLeap);
        }else {
            System.out.println(" The YEar is not   Leap Year: "+isLeap);
        }
        scanner.close();


    }
}

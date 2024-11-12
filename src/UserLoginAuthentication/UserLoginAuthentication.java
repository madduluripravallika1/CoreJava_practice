package UserLoginAuthentication;

import java.util.Scanner;

public class UserLoginAuthentication {
    public void method1(){
        System.out.println(" Welcome to  UserLoginAuthentication ");
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter the USERNAME : ");
        String correct_user=scanner.nextLine();
        System.out.print(" Enter the Password : ");
        String correct_password=scanner.nextLine();
        String myuser="Madduluri@123";
//        System.out.println(myuser);
        String myPassword="Pavi@1234";
//        System.out.println(myPassword);
        try {
            if (myuser.equals(correct_user) && myPassword.equals(correct_password)){
                System.out.println("Welcome to website !!!!!!!!!!!!!!!!! ");
            }else {
                throw new  IllegalArgumentException("invalid login attempt !!!!!!!!!!!!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        UserLoginAuthentication userLoginAuthentication=new UserLoginAuthentication();
        userLoginAuthentication.method1();
    }
}

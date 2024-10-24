package exceptionhandling;

public class ClassA {
    public void method1() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException  e) {
            System.out.println("Arithmetic Exception is getting");
        }
    }
    public  void method2(){
        try{
            String s=null;
            System.out.println(s.length());
        }catch (NullPointerException  e){
            System.out.println("Null Pointer Exception is Occured");
        }
    }
    public void method3(){
        try{
            String s1="10";
            int i=Integer.parseInt(s1);
            System.out.println(i);
        }catch (NumberFormatException e){
            System.out.println("No  NumberFormatException");
        }
    }
    public void method4(){
        try{
            String s1="abc";
            int i=Integer.parseInt(s1);
            System.out.println(i);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
    }
    public void method5(){
        try{
           int a[]=new int[5];
           a[10]=400;
            System.out.println(a[1]);
        }catch (ArrayIndexOutOfBoundsException   e){
            System.out.println("ArrayIndexOutOfBoundsException  ");
        }
    }

    public static void main(String[] args) {
        ClassA classA=new ClassA();
//        classA.method1();
//        classA.method2();
//        classA.method3();
//        classA.method4();
        classA.method5();
    }
}

package Self_Practice;



        //Use if to specify a block of code to be executed, if a specified condition is true
        //Use else to specify a block of code to be executed, if the same condition is false
        //Use else if to specify a new condition to test, if the first condition is false
        //Use switch to specify many alternative blocks of code to be executed
import java.util.Scanner;
class looping{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = a.nextInt();
        System.out.println("age is :"+age);
        System.out.println("Please enter your name:");
        String name = a.next();
        System.out.println("name is "+name);
        // System.out.println("please enter trueor false");
        // Bool arp = a.nextBoolean();
        // System.out.println("Boolean is:");

        //   if(age>=18){
        //     System.out.println("You are adult");
        //  else{
        //     System.out.println("You areu underage");
        //  }
    }
}
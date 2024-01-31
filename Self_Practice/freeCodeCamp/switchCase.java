package Self_Practice.freeCodeCamp;

import java.util.Scanner;
class switchCase {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number:");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What operators do u want to perform ? ");
        String operations = scanner.nextLine();

        switch(operations){
            case "Addition":
                System.out.printf("%f + %f = %f",num1,num2,num1+num2);
                break;
            case "Subtraction":
                System.out.printf("%f - %f = %f",num1,num2,num1-num2);
                break;
            case "Multiplication":
                System.out.printf("%f * %f = %f",num1,num2,num1*num2);
                break;
            case "Divison":
                System.out.printf("%f / %f = %f",num1,num2,num1/num2);
                break;
        }
   } 
}

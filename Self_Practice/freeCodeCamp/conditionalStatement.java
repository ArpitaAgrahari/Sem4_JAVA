package Self_Practice.freeCodeCamp;

//calculator using if else nd nested if
import java.util.Scanner;
class conditionalStatement {
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
        
        if(operations.equals("Sum")){
            System.out.printf("%f + %f = %f",num1,num2,num1+num2);
        }
        else if(operations.equals("Subtraction")){
            System.out.printf("%f - %f = %f",num1,num2,num1-num2);
        }
        else if(operations.equals("Multipliction")){
            System.out.printf("%f * %f = %f",num1,num2,num1*num2);
        }
        else if(operations.equals("Division")){
            System.out.printf("%f / %f = %f",num1,num2,num1/num2);
        }
        else{
            System.out.println("Invalid Operatons");
        }

        scanner.close();
    }
}

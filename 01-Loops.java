// Working of Loops

import java.util.Scanner;
class myClass{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int age = s.nextInt();
        if(age>18){
            System.out.println("You can vote now!");
        }
        else if(age==18){
            System.out.println("You can't vote now!");
        }else{
            System.out.println("Wait now!");
        }
        s.close();   
    }
}
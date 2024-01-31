package Self_Practice.freeCodeCamp;


/* 
class Operators {
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 6;

        //addition
        System.out.println(num1 + num2);   //18

        //Subtarction
        System.out.println(num1 - num2);    //6
        System.out.println(num2 - num1);   //-6

        //multiplication
        System.out.println(num1 * num2);   //72 

        //division
        System.out.println(num1/num2);    //2

        //reminder(modulo)
        System.out.println(num1%num2);    //0
    }
}

*/


import java.util.Scanner;
class Operators{
    public static void main(String[] args){
        int num1 = 12;
           // num1 = num1 +5;
        num1 += 5;
        num1 -= 5;
        num1 %=2;
        System.out.println(num1);
    }
}
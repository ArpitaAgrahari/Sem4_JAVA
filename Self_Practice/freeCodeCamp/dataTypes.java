package Self_Practice.freeCodeCamp;



//there are two types of data types that are primitive and non-primitive/reference type.

//primitive types: stores  integer values
//non-primitve/refrence types:  stores the refrnce of a variable or dynamic object is being stored.

/* 

class dataTypes {
    public static void main(String[] args){

        //integer types
        byte aSingleByte = 100;
        short aSmallNumber = 20000;
        int anInteger = 2147483647;
        long aLargeNumber = 9223372036854775807L; // Updated value

        //decimal types;
        double aDiuble = 1.79769313;
        float aFloat = 3.4028F;

        //boolean
        boolean isWeekand = false;
        boolean isWorkday = true;

        //character;
        char copyRightsysmbol = '\u00A9';

        System.out.println("This is copyright symbol: "+copyRightsysmbol);
    }
}


*/


import java.util.Scanner;
class dataTypes{
    public static void main(String[] args){
        int num1 = 5;
        double num2 = num1;
        System.out.println("The diuble value of num1 is: " +num2);
    }
}
package Self_Practice;


//Strings are used for storing text.
import java.util.Scanner;
class stringInJava{       
    public static void main(String[] args){
        String greeting = "Hello!! Harshit";
        //A String in Java is actually an object, which contain methods that can perform certain operations on strings.
        System.out.println("the length of greeting is:" + greeting.length());
        //upper case printing or converasion
        System.out.println("The upper case of greting is: " +greeting.toUpperCase());
        //lower acse conversion
        System.out.println("the lower Case of greeting is: "+greeting.toLowerCase());
        //Java counts positions from zero.0 is the first position in a string, 1 is the second, 2 is the third ...
        System.out.println("The index of given letter is:" + greeting.indexOf("Harshit"));
        
    }
}

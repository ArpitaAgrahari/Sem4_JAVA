package Self_Practice.freeCodeCamp;


/* 
import java.util.Scanner;
class stringsInJava {
    public static void main(String[] args){
        char percentSign = '%';
        System.out.println(percentSign);
    }
}

*/

/*
import java.util.Scanner;
class stringsInJava{
    public static void main(String[] args){
        //String name = "hey!! i am arpita";  // if we rewrite the name or overwrite the jvm simply checks if the vriables address already exist or not and overwrite the content int that inky.it will not assign any new address to such string name
        String name = new String("Hey! excuse me!");

        //while using new keyword whatever if address exists or not it will assign new address and stores the content in that only.
        System.out.println(name);
    }
}
*/

/* 
import java.util.Scanner;
class stringsInJava{
    public static void main(String[] args){

        //literal Strings
        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        //here we can notice beacoz of new keyword indeed of same content both a=have different value in case of address .they act as individle.
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2);

    }
}

*/


/* 
import java.util.Scanner;
class stringsInJava{
    public static void main(String[] args){
        // System.out.println("Hello world !! my name is Arpita Agrahari");
        String name = "arpita Agrahari";  //%s
        String country = "India";   //%s
        int age  = 20;     //%d
        double gpa = 9.2;    //%f
        //simple concat of every inputs
        //System.out.println("Hello world!! my name is "+name+" my country name is "+country+" and my age is "+age);

        //printing through access specifiers 
        //for boolean access specifiers is %b.
        //for char it is %c.
        String formattedString = String.format("my name is %s. i am from %s.my age is %d.my gpa is %f",name,country,age,gpa);
        System.out.println(formattedString);
    }
}
*/




//length

import java.util.Scanner;
class stringsInJava{
    public static void main(String[] args){
        String name = "Arpita Agrahrai";
        System.out.println(name.length());
    }
}
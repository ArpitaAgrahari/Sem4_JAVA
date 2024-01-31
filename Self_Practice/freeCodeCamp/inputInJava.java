package Self_Practice.freeCodeCamp;

import java.util.Scanner;
class inputInJava {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is ur name?");
        String name = scanner.nextLine();
        //System.out.println("Your name is: "+name);
        System.out.printf("Hello %s. How are you ?",name);

        scanner.close();
    }  
}

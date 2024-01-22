package Self_Practice;

// import java.util.Scanner;
// class hey{
//     public static void main(String[] args){
//         int x = 2;
//         switch(x){
//             case 1:
//                System.out.println("Hey1 I am 1");
//                break;
//             case 2:
//                 System.out.println("Hey! I am 2");
//                 break;
//             case 3:
//                 System.out.println("Hey! I am 3");
//                 break;
//             default:
//                 System.out.println("Hey!. I am default");
//         }
//     }
// }



//WHILE LOOP'

// import java.util.Scanner;
// class hi{
//     public static void main(String[] args){
//         int i = 0;
//         while(i<5){
//             System.out.println("The iteration is: "+i);
//             i++;
//         }
//     }
// }


//DO....WHILE LOOP

// import java.util.Scanner;
// class hi{
//     public static void main(String[] args){
//         int i = 0;
//         do{
//             System.out.println("Hey! I am here!!");
//             i++;
//         }while(i<5);
//     }
// }



//FOR LOOP

// import java.util.Scanner;
// class hey{
//     public static void main(String[] args){
//         for(int i = 0;i<5;i++){
//             System.out.println("hey there!!");
//         }
//     }
// }


// import java.util.Scanner;
// class table{
//     public static void main(String[] args){
//         for(int i=0;i<20;i++){
//             if(i%2 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// import java.util.Scanner;
// class tableOf3{
//     public static void main(String[] args){
//         for(int i=0;i<15;i++){
//             if(i%2 != 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


//FOR_EACH LOOP
/*

There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

Syntax:
for (type variableName : arrayName) {
  // code block to be executed
}  

*/

// import java.util.Scanner;
// class hi{
//     public static void main(String[] args){
//         String[] fruit = {"Apple","Orange","Lemon","Mango"};
//         for(String i:fruit){
//             System.out.println(i);
//         }
//     }
// }


// import java.util.Scanner;
// class hi{
//     public static void main(String[] args){
//         String[] num = {"23","45","98","34"};
//         for(String i: num){
//             System.out.println(i);
//         }
//     }
// }


//BREAK STATEMENT
/* 
It was used to "jump out" of a switch statement.

The break statement can also be used to jump out of a loop.
 

//CONTINUE STATEMENT
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

*/

// import java.util.Scanner;
// class hi{
//     public static void main(String[] args){
//         for(int i = 0;i<10;i++){
//             if(i==4){
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }


// import java.util.Scanner;
// class hey{
//     public static void main(String[] args){
//         for(int i =0;i<10;i++){
//             if(i==4){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }
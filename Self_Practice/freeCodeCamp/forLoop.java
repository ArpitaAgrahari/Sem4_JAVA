package Self_Practice.freeCodeCamp;



/* 
import java.util.Scanner;
class forLoop {
    public static void main(String[] args){
        for(int i = 1;i<=10;i++){
            System.out.println("Hello there!!");
        }
    }
}
*/


/* 
import java.util.Scanner;
class forLoop{
    public static void main(String[] args){
        int number[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i=1;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}

*/


/* 
import java.util.Scanner;
class forLoop{
    public static void main(String[] args){
        int num[] = {1,2,3,4,5};
        int sum = 0;
        for(int i =0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println(sum);
    }
}

*/

/* 
import java.util.Scanner;
class forLoop{
    public static void main(String[] args){
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
*/


//special type of for loop
import java.util.Scanner;
class forLoop{
    public static void main(String[] args){
        int number[] = {1,2,3,4,5,6};
        int sum = 0;
        for(int i:number){
            sum += i;
            System.out.println(sum);
        }
    }
}

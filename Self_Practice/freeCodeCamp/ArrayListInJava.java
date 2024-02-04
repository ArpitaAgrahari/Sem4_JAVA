package Self_Practice.freeCodeCamp;


import java.util.ArrayList;
class ArrayListInJava {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<Integer>();

        //int double float boolean
        //Integer Double Float Boolean
        number.add(1);  //0
        number.add(2);  //1
        number.add(3);  //2
        number.add(4);  //3
        number.add(5);  //4

        System.out.println(number.toString());
        //to fetch a particular element we can use get() command
        System.out.println(number.get(2));
    }
}

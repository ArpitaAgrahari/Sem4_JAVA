package Self_Practice.freeCodeCamp;


import java.util.ArrayList;
import java.util.Comparator;
class ArrayListInJava {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<Integer>();

        //int double float boolean
        //Integer Double Float Boolean
        number.add(4);  //0
        number.add(1);  //1
        number.add(5);  //2
        number.add(3);  //3
        number.add(2);  //4

        /* 
        System.out.println(number.toString());


        //to fetch a particular element we can use get() command
        System.out.println(number.get(2));



        //to sort an array elements
        number.sort(Comparator.naturalOrder());
        System.out.println(number.toString());


        //to check wheather an elememnt exist or not in array
        System.out.println(number.contains(Integer.valueOf(5)));
        System.out.println(number.contains(Integer.valueOf(7)));



        //to check wheather the array is empty 
        System.out.println(number.isEmpty());



        //number.remove(3);
        //OR
        //to remove element from array
        number.remove(Integer.valueOf(4));
        System.out.println(number.toString());



        //to set values of element in array
        number.set(2, Integer.valueOf(30));
        System.out.println(number.toString());



        //to clear the array 
        number.clear();
        System.out.println(number);


        System.out.println(number.isEmpty());

        */
        number.forEach(num ->{
            System.out.println(num*2);
        });
        System.out.println(number.toString());
    }
}

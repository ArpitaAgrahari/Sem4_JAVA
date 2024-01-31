package Self_Practice.freeCodeCamp;

import java.util.Arrays;
class arrayInJava {
    public static void main(String[] args){
        /*
        char vowels[] = new char[5];
        //a e i o u
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
            */

        char vowels[] = {'e','u','i','a','o'};

            //System.out.println(vowels[2]);
        
            //inbuilt array printing 
        //System.out.println(Arrays.toString(vowels));

            //to get length 
        //System.out.println(vowels.length);

            //to sort
        //Arrays.sort(vowels);
        //System.out.println(Arrays.toString(vowels));
        

            //if we want to perform sorting in a finite range in array
        /* 
        int start = 1;
        int end = 4; 
        Arrays.sort(vowels,start,end);
        System.out.println(Arrays.toString(vowels));
        */


        /* 
        //Binary Search using in built
       
        Arrays.sort(vowels);

        int start = 1;
        int end = 4;

        char key = 'o';

        //it has a inbuilt in java to search as binary search
        int foundIndex = Arrays.binarySearch(vowels,start,end,key);
        System.out.println(Arrays.toString(vowels));
        System.out.println(foundIndex);

        */

        //it is used to fill the indexs in the array
        //it can be in start and end index and that is in the range
        //Arrays.fill(vowels, 'x');
        //System.out.println(Arrays.toString(vowels));


        //to copy the array to another array is possible
        /* 
        int num[] = {1,2,3,4,5};

        int copyOfNumber[] = num;
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(copyOfNumber));

        */

        //it we want to copy elemenst after the existed array
        int num[] = {1,2,3,4,5};

        int copyOfNum[] = Arrays.copyOf(num,num.length);

        Arrays.fill(num,0);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(copyOfNum));
    }
}

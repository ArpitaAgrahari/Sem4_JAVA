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
        int start = 1;
        int end = 4; 
        Arrays.sort(vowels,start,end);
        System.out.println(Arrays.toString(vowels));
    }
}

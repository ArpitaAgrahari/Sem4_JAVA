package Self_Practice.freeCodeCamp;

import java.util.Scanner;
import java.util.HashMap;

class hashMaps {
    public static void main(String[] args){
        HashMap<String,Integer> examScore = new HashMap<String, Integer>();
        examScore.put("Math",75);
        examScore.put("Sociology",85);
        examScore.put("English",95);
        examScore.put("Computer Programming",95);


        System.out.println(examScore.toString());
    }
}

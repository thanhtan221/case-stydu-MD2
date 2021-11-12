package utils;

import java.util.ArrayList;

public class Random {

    public static int randomIdxArr(ArrayList<String> list){
        int max =  list.size() - 1;
        int  a = (int) (Math.random()*(max+1));
         return a;
    }

}
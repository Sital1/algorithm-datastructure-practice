package arraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class checkPermutations {

    /*
    Given two strings, write a method to decide if one is a permutation of the
    other.
     */

    public static boolean checkPermutations(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        int diff = 0;

        for(int i =0; i<str1.length(); i++){
            diff += str1.charAt(i) - str2.charAt(i);
        }

        if(diff == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("True: " +checkPermutations("debug", "gubed")); // should return true
        System.out.println("False: " +checkPermutations("abcd", "bcde")); // should return false

        System.out.println("False: " +checkPermutations("a", "bc")); // should return false

        System.out.println("True: " +checkPermutations("mango", "goman")); // should return true

    }
}

package arraysAndStrings;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashSet;
import java.util.Set;

public class IsUnique {


    /*
        Implement an algorithm to determine if a string has all unique characters. What if you
        cannot use additional data structures?
    */


    // using Hash set the time complexity would be O(N) in the worst case.
    public static boolean isUniqueUsingHashSet(String str){

        Set<Character> set = new HashSet<Character>();


        CharacterIterator it = new StringCharacterIterator(str);

        while (it.current() != CharacterIterator.DONE){

           if(set.add(it.current()) == false)
               return true;
            it.next();
        }

            return false;
    }


/*

    If datastructures cannot be used, the string can be sorted which could take O(n logn) time, and the sorted string can be linearly checked.

 */


    public static void main(String[] args) {

        String test1 = "abcde"; // return false
        String test2 = "aabbc"; // return true

        System.out.println( isUniqueUsingHashSet(test1));
        System.out.println(isUniqueUsingHashSet(test2));



    }
}

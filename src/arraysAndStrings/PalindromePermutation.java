package arraysAndStrings;

/*
Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)

*/


import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {

    public static boolean checkPalindromePermutationString(String str){
        int checkValue = 0;
        str = str.replaceAll("\\s+", "");
        str = str.toLowerCase();
        Set<Character> ch = new HashSet<Character>();

        for(int i = 0; i<str.length();i++){
            if(ch.add(str.charAt(i))){
                checkValue += 1;
            }else{
                checkValue += -1;
                ch.remove(str.charAt(i));
            }
        }
        if(str.length()%2 == 0 && checkValue==0){
            return true;
        }
        if(str.length()%2 == 1 && checkValue==1){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkPalindromePermutationString("Tact Coa"));
        System.out.println(checkPalindromePermutationString("Math"));
        System.out.println(checkPalindromePermutationString("evell"));
    }
}

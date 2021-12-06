package me.adamcraftmaster.projs;

import java.util.Scanner;

public class LetterValueSum {

    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = in.nextLine();
        in.close();
        System.out.println("The score of the letter values of " + word + " is: " + letterValueSum(word));
    }

    public static int letterValueSum(String str) {
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] string = str.toCharArray();
        int score = 0;

        for(int stringI = 0; stringI < string.length; stringI++) {
            for(int lettersJ = 0; lettersJ < letters.length; lettersJ++) {
                if(Character.toString(letters[lettersJ]).equals(Character.toString(string[stringI]))) {
                    //System.out.println(string[stringI] + " is equal to " + letters[lettersJ] + " adding " + (lettersJ+1));
                    score += (lettersJ+1);
                }
            }
        }
        return score;
    }
    
}

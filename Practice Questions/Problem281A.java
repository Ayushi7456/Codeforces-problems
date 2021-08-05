// word Capiralization
import java.util.*;
import java.io.*;

public class Problem281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String firstLetter = word.substring(0, 1);
        String remainingLetters = word.substring(1, word.length());
        firstLetter = firstLetter.toUpperCase();
        word = firstLetter + remainingLetters;
        System.out.println(word);
    }
}

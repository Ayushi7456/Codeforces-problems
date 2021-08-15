
// Problem236A (hashset implementation)
import java.util.*;
import java.io.*;

public class boyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> m = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            m.add(s.charAt(i));
        }
        int number = m.size();
        if (number % 2 == 0) {
            System.out.print("CHAT WITH HER!");
        } else {
            System.out.print("IGNORE HIM!");
        }
    }
}


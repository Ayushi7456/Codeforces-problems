// problem 443A
import java.util.*;
import java.io.*;

public class AtonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        // HashSet doesn’t allow duplicate values.
        Set<Character> m = new HashSet<Character>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                m.add(s.charAt(i));
            }
        }
        System.out.println(m.size());
    }
}
// HashSet is an unordered collection containing unique elements. It has the standard collection operations Add, Remove, Contains, but since it uses a hash-based implementation, these operations are O(1).
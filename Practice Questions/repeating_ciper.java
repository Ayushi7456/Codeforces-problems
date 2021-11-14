import java.util.*;
import java.io.*;

public class repeating_ciper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String t = sc.next();
        String s = "" + t.charAt(0);
        int d = 1;
        for (int i = 1; i < t.length(); i = i + d) {
            s = s + t.charAt(i);
            d++;
        }
        System.out.println(s);
    }

}
// Sequence is: 1 3 6 10 15 21 28.....
/*
 * int d=1; 
 * for(int i=1; i<55; i=i+d){ 
 *       System.out.println(i)
 *       d++; 
 * }
 */
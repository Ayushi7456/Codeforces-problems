import java.util.*;
import java.io.*;

public class shortSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String b = sc.next();
            String a = b.charAt(0) + "";
            for (int i = 0; i < b.length(); i++) {
                if (i % 2 != 0) {
                    a += b.charAt(i);
                }
            }
            System.out.println(a);
        }
    }
}

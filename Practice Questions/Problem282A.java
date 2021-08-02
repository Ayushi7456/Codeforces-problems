import java.io.*;
import java.util.*;

public class Problem282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0;
        while (n-- > 0) {
            String str = sc.next();
            if (str.charAt(0) == 'X') {
                if (str.charAt(1) == '+') {
                    X++;
                }
                if (str.charAt(1) == '-') {
                    X--;
                }
            } else if (str.charAt(0) == '+') {
                ++X;
            } else {
                --X;
            }
        }
        System.out.println(X);
    }
}

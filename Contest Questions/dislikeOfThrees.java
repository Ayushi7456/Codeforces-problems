import java.util.*;
import java.io.*;

public class dislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int j = 1;
            int result = 0;
            int a = 1;
            while (j <= k) {
                if (a % 3 != 0 && a % 10 != 3) {
                    result = a;
                    j++;
                }
                a++;
            }
            System.out.println(result);
        }

    }
}

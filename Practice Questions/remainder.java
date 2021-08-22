import java.util.*;
import java.io.*;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            int h = (n - y) / x;
            int k = x * h + y;
            System.out.println(k);
        }
    }
}

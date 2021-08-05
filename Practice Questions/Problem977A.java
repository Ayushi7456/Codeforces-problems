// wrong subtraction
import java.util.*;
import java.io.*;

public class Problem977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while (k > 0) {
            int lastDig = n % 10;
            if (lastDig != 0) {
                n--;
            } else {
                n /= 10;
            }
            k--;
        }
        System.out.println(n);
    }
}

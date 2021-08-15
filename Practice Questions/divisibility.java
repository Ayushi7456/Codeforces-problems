
// problem 1328A
import java.util.*;
import java.io.*;

public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % b == 0) {
                System.out.println("0");
            } else {
                // int count = 0;
                // while (a % b != 0) {
                // a++;
                // count += 1;
                // System.out.println(count);         //bruteforce approach
                System.out.println(b - (a % b));     //optimized approach
            }

        }
    }
}